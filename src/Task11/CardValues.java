package Task11;

public class CardValues {

    public static int value (String card)
    {
        int points = 0;
        String[] tempList = card.split(" ");

        switch (tempList[0]) {
            case "Ace":
                points += 11;
                break;

            case "Two":
                points += 2;
                break;
            
            case "Three":
                points += 3;
                break;
            
            case "Four":
                points += 4;
                break;

            case "Five":
                points += 5;
                break;

            case "Six":
                points += 6;
                break;

            case "Seven":
                points += 7;
                break;

            case "Eight":
                points += 8;
                break;

            case "Nine":
                points += 9;
                break;

            case "Ten":
                points += 10;
                break;

            case "Jack":
                points += 10;
                break;

            case "Queen":
                points += 10;
                break;

            case "King":
                points += 10;
                break;

            default:
                break;
        }

        return points;
        
    }    
}
