package Task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardMain {

    public static void main(String[] args) {

        // Build a deck of playing cards
        List<String> deck = new ArrayList<>();
        String card;
        
        // Each deck has 4 suits and each suit has 13 cards of different values.
        String[] Suit = {"SPADES", "HEARTS", "CLUBS", "DIAMONDS"};
        String[] CardValue = {"ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
        
        for (String s : Suit)
        {
            for (String v : CardValue)
            {
                card = v + " of " + s;
                deck.add(card);
            }
        }
        System.out.println(deck);

        Collections.shuffle(deck);

        System.out.println(deck);
            
    }
    
    
}
