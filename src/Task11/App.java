package Task11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {

    public static void main(String[] args) {
        
        List<Card> deck = new ArrayList<>(); // Create a deck that holds cards

        for (Suit s : Suit.values()) // Suit.values() is like an array, iterate ea suit
        {   
            for (CardValue v : CardValue.values()) // iterate 13 cards thru ea suit
            {
                Card c = new Card(s, v); 

                deck.add(c); // add card to deck

            }
        }

        // System.out.println(deck);

        System.out.println("Normal deck: ");
        for (Card c : deck)
        {
            System.out.println(c);
        }

        Collections.shuffle(deck);
        
        System.out.println("Shuffled deck: ");
        for (Card c: deck)
        {
            System.out.println(c);
        }

        // for(int i = 0; i < 4; i++) // Total of 4 suits
        // {
        //     Suit s = Suit.values()[i];

        //     for (int j = 0; j < 13; j++) // 13 cards in each suit
        //     {
        //         CardValue v = CardValue.values()[j];
        //     }
            
        // }

    }
    
}
