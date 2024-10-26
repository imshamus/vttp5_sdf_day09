package Task10;

import java.util.ArrayList;
import java.util.List;

public class Evaluator 
{
    public Evaluator()
    {

    }
 
    public static String checker(String userInput, List<Integer> numList, int i)
    {   
        String result;

        if (numList.get(i) < numList.get(0) && userInput.equals("L"))
        {   
            result = "Correct";

            return result;
        }

        else if (numList.get(i) < numList.get(0) && !userInput.equals("L"))
        {
            result = "Wrong";

            return result;
        }

        else if (numList.get(i) > numList.get(0) && userInput.equals("H"))
        {
            result = "Correct";

            return result;
        }

        else if (numList.get(i) > numList.get(0) && !userInput.equals("H"))
        {
            result = "Wrong";

            return result;
        }

        else if (numList.get(i) == numList.get(0) && userInput.equals("S"))
        {
            result = "Correct";

            return result;
        }

        else if (numList.get(i) == numList.get(0) && !userInput.equals("S"))
        {
            result = "Wrong";

            return result;
        }
        else
        {
            // return null; // avoid return null
            return "invalid";
        }
    }
    
}
