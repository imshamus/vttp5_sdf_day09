package Task11;

import java.util.List;

public class PointsCalc {
    
    public static int score(List<String> hand)
    {   
        
        // System.out.println(hand);
        int points = 0; // Initiliase player's score
        int index = 1; // Initialise player's cards index

        System.out.println("Current Hand: ");
        for (String card : hand)
        {   
            System.out.printf("%d. %s | Card point: %d \n", index, card, CardValues.value(card));
            points += CardValues.value(card);
            index++;
        }
        System.out.println("Total Score: " + points);
        System.out.println();

        return points;
    }

    
}