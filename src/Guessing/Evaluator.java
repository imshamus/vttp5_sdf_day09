package Guessing;

import java.util.List;

public class Evaluator 
{
    public Evaluator()
    {

    }
 
    public static int checker(String userInput, List<Integer> numList, int i)
    {
        int c = 1;
        int w = 0;


        if (numList.get(i) < numList.get(0) && userInput.equals("L"))
        {
            System.out.println("Correct.");
            return c;
        }

        else if (numList.get(i) < numList.get(0) && userInput.equals("H"))
        {
            System.out.println("Wrong.");
            return w;
        }

        else if (numList.get(i) > numList.get(0) && userInput.equals("H"))
        {
            System.out.println("Correct.");
            return c;
        }

        else if (numList.get(i) > numList.get(0) && userInput.equals("L"))
        {
            System.out.println("Wrong.");
            return w;
        }
        else
        {
            System.out.println("please key in only 'h' or 'l'");
            return -1; // Return an error code, e.g., -1, for invalid input
        }
    }

    
}
