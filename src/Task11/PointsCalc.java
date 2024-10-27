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

    public static void compareResults (int playerPoints, int bankerPoints)
    {
        System.out.println("Player Final Points: " + playerPoints);
        System.out.println("Banker Final Points: " + bankerPoints);

        if (playerPoints > bankerPoints && playerPoints <= 21) // Both under 21 but player more points
        {
            System.out.println("Player won.");
        }
        else if (bankerPoints > playerPoints && bankerPoints <= 21) // Both under 21 but banker more points
        {
            System.out.println("Banker won.");
        }
        else if (playerPoints <= 21 && bankerPoints > 21) // Player under 21, Banker bust
        {
            System.out.println("Player won.");
        }
        else if (bankerPoints <= 21 && playerPoints > 21) // Banker under 21, player bust
        {
            System.out.println("Banker won.");
        }
        else if (playerPoints == bankerPoints && playerPoints <= 21) // Both under 21 but equal points
        {
            System.out.println("Draw.");
        }
        else if (playerPoints > 21 && bankerPoints > 21) // Both bust
        {
            System.out.println("Draw.");
        }
    }
}