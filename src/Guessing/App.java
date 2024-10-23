package Guessing;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {

        Console cons = System.console();

        while(true)
        {
            List<Integer> numList = GenRandom();
            System.out.println(numList);

            String output = numList.get(0).toString();

            System.out.println("Is next num 'h' or 'l'?");
            String userInput = cons.readLine(">>> ");
            userInput= userInput.toUpperCase();            
            
            for(int i = 1; i < numList.size(); i++)
            {   
                int cw = 0;

                while(cw != -1)
                {
                    if (userInput.equals("H") || userInput.equals("L"))
                    {
                        cw = Evaluator.checker(userInput, numList, i);
                    }  
                }
                
            }

                System.out.println(output);
                // System.out.println("------------------------");
                // System.out.printf("| Correct: %s | Wrong: %s |\n", correctCount, wrongCount);
                // System.out.println("------------------------");
            }
            
        }
        

    // Generate 10 random numbers
    public static List<Integer> GenRandom()
    {
        List<Integer> numList = new ArrayList<>();
        Random random = new Random();

        for (int i =0; i < 10; i++)
        {
            int randomNumber = random.nextInt(1, 101);
            numList.add(randomNumber);
        }
        
        // int min = 1;
        // int max = 100;
        // int randomNumber = random.nextInt(max - min + 1) - min; // other way of doing random

        return numList;
    }
    
    //

    // Show first shuffled number
    // User guess next number higher h or lower l

    // Guessed array.add guessed number
}
