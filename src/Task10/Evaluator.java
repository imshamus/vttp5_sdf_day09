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
            System.out.println(result);

            return result;
        }

        else if (numList.get(i) < numList.get(0) && userInput.equals("H"))
        {
            result = "Wrong";
            System.out.println(result);

            return result;
        }

        else if (numList.get(i) > numList.get(0) && userInput.equals("H"))
        {
            result = "Correct";
            System.out.println(result);

            return result;
        }

        else if (numList.get(i) > numList.get(0) && userInput.equals("L"))
        {
            result = "Wrong";
            System.out.println(result);

            return result;
        }
        else
        {
            return null;
        }
    }

    public static List<Integer> Compare(List<Integer> numList)
    {   
        List<Integer>compareResults = new ArrayList<>();

        
        return compareResults;
    }
    
}
