package Task11;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardMain {

    public static void main(String[] args) {

        Console cons = System.console();
        String userInput = "";
        
        while (true)
        {
            boolean restart = false;

            // Initialised new shuffled deck
            List<String> deck = newDeck();

            // Player draw deck index 0 and 2,
            List<String> playerHand = new ArrayList<>();
            playerHand.add(deck.get(0));
            playerHand.add(deck.get(2));

            // Banker draw deck index 1 and 3
            List<String> bankerHand = new ArrayList<>();
            bankerHand.add(deck.get(1));
            bankerHand.add(deck.get(3));

            // Remove drawn cards
            deck.subList(0, 4).clear(); // Removes the first 4 elements (index 0 to 3), 0 - inclusive, 4 - exclusive 
            
            while(!restart)
            {   
                System.out.println("p" + playerHand); // For Testing
                System.out.println("b" + bankerHand); // For Testing
                
                // INSTANT WINS
                // if player 10 || J || Q || K && A, player win with BJ
                if (((playerHand.get(0).startsWith("Ten")   || 
                    playerHand.get(0).startsWith("Jack")    || 
                    playerHand.get(0).startsWith("Queen")   || 
                    playerHand.get(0).startsWith("King"))   
                    && 
                    playerHand.get(1).startsWith("Ace"))

                    || 
                    
                    ((playerHand.get(1).startsWith("Ten")   || 
                    playerHand.get(1).startsWith("Jack")    || 
                    playerHand.get(1).startsWith("Queen")   || 
                    playerHand.get(1).startsWith("King"))   
                    && 
                    playerHand.get(0).startsWith("Ace")))
                {
                    System.out.println("Player ban luck. Player won.");
                    
                    restart = restart();

                    if (restart == false)
                    {
                        return; // end program
                    }
                }
                
                // if player A && A, player win with BB
                if (playerHand.get(0).equals("Ace") && playerHand.get(1).equals("Ace"))
                {
                    System.out.println("Player ban ban. Player won.");
                    
                    restart = restart();

                    if (restart == false)
                    {
                        return; // end program
                    }
                }

                // if banker 10 || J || Q || K && A, banker win with BJ
                if (((bankerHand.get(0).startsWith("Ten")   || 
                    bankerHand.get(0).startsWith("Jack")    || 
                    bankerHand.get(0).startsWith("Queen")   || 
                    bankerHand.get(0).startsWith("King"))   
                    && 
                    bankerHand.get(1).startsWith("Ace"))

                    || 
                    
                    ((bankerHand.get(1).startsWith("Ten")   || 
                    bankerHand.get(1).startsWith("Jack")    || 
                    bankerHand.get(1).startsWith("Queen")   || 
                    bankerHand.get(1).startsWith("King"))   
                    && 
                    bankerHand.get(0).startsWith("Ace")))
                {
                    System.out.println("Banker ban luck. Player won.");
                    
                    restart = restart();

                    if (restart == false)
                    {
                        return; // end program
                    }
                }
                
                // if banker A && A, banker win with BB
                if (bankerHand.get(0).equals("Ace") && bankerHand.get(1).equals("Ace"))
                {
                    System.out.println("Banker ban ban. Banker won.");
                    
                    restart = restart();

                    if (restart == false)
                    {
                        return; // end program
                    }
                }

                // Player
                System.out.println("Player's turn.");
                System.out.println();
                int playerPoints = PointsCalc.score(playerHand);
                
                // if player < 16, player must draw
                while (playerPoints < 16)
                {
                    System.out.println("Player must draw a card.");
                    System.out.println();
                    playerHand.add(deck.remove(0)); // Draw top card to player's Hand, remove it from deck
                    playerPoints = PointsCalc.score(playerHand);

                    if (playerPoints > 21)
                    {
                        System.out.println("Banker's turn.");
                        break;
                    }
                }

                // if player > 16 but < 21
                while (playerPoints > 15 && playerPoints < 21)
                {   
                    System.out.println("Would player like to draw a card? (Y/N)");
                    userInput = cons.readLine(">>> ").toLowerCase();

                    if(userInput.equals("y"))
                    {
                        playerHand.add(deck.remove(0)); // Draw top card to player's Hand, remove it from deck
                        playerPoints = PointsCalc.score(playerHand);

                        if (playerPoints > 21)
                        {
                            System.out.println("Banker's turn.");
                            break;
                        }
                    }
                    else if (userInput.equals("n"))
                    {
                        playerPoints = PointsCalc.score(playerHand);
                        System.out.println("Player ended turn.");
                        break;
                    }
                    else 
                    {
                        System.out.println("Please enter only 'Y' or 'N'. ");
                    }

                }



                restart = restart();

                if (restart == false)
                {
                    return; // end program
                }    

                // System.out.println("Banker Total Score: " + bankerPoints);
            }
        }           
    }
    
    // Methods
    public static List<String> newDeck()
    {
        // Build a deck of playing cards
        List<String> deck = new ArrayList<>();
        String card;
        
        // Each deck has 4 suits and each suit has 13 cards of different values.
        String[] Suit = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] CardValue = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        
        for (String s : Suit)
        {
            for (String v : CardValue)
            {
                card = v + " of " + s;
                deck.add(card);
            }
        }
        
        Collections.shuffle(deck);

        return deck;
    }
    
    public static boolean restart()
    {
        Console cons = System.console();

        while (true)
        {
            System.out.println("Restart? Y/N");
            String userInput = cons.readLine(">>> ").toLowerCase();

            if (userInput.equals("y"))
            {
                return true;
            }
            else if (userInput.equals("n"))
            {
                System.out.println("Thank you for playing.");
                return false;
            }
            else
            {
                System.out.println("Please enter only 'y' or 'n'.");
            }
        }
    }

    
}
