package Cards;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App 
{
    public static void main(String[] args) {
        task11();
    }
    public static void task09()
    {

    }

    public static void task11() // why static keyword?
    {
        String [] suits = {"SPADE", "HEART", "CLUB", "DIAMOND"}; //1
        String [] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"}; //2

        List<String> deck = new ArrayList<>(); //3, arraylist to use Collections, Collections.sort(deck) or Collections.shuffle(deck)
        

        // 52 cards in a deck
        // int numberOfDeckCards = suits.length * ranks.length; // use this to use string array
        // String[] decks = new String[numberOfDeckCards]; // this no good cause must use random etc logic,
        // or can use set thn print unordered.

        // create deck of card in sequence
        for(int i = 0; i < suits.length; i++) {
            for (int j = 0; j <ranks.length; j++) {
                deck.add(suits[i] + " " + ranks[j]);
            }
        }

        // Print sequence cards
        for (String card : deck)
        {
            System.out.println(card);
        }  

        // shuffle
        Collections.shuffle(deck);

        // print the shuffled deck
        for (String card : deck)
        {
            System.out.println(card);
        }      
        
        // enum enumeration? suit rank? to get card? arraylist of card?
    }
}
