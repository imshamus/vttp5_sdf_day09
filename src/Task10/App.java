package Task10;

import java.io.Console;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class App 
{
    public static void main(String[] args) {

        Console cons = System.console();

        while(true)
        {
            // Start generating 10 numbers
            List<Integer> numList = GenRandom();
            System.out.println("List: " + numList);  

            // Shuffles the list
            Collections.shuffle(numList);
            System.out.println("Shuffled List: " + numList);  

            // initialise vars
            String output = numList.get(0).toString(); // Base output from shuffled list for appending results
            int correctCounter = 0; // Score counter for correct guesses
            int wrongCounter = 0; // Score counter for wrong guesses


            for(int i = 1; i < numList.size(); i++) // ask user high or low for each number in list
            {   
                // Get first number in list as reference
                System.out.println("Reference number: " + numList.get(0).toString());
                // System.out.println("Next number: " + numList.get(i)); // for testing

                // Prompt
                System.out.println("Is next num 'h' or 'l'?");
                
                // Get user's input
                String userInput = cons.readLine(">>> ");
                userInput= userInput.toUpperCase(); 


                if (userInput.equals("H") || userInput.equals("L"))
                {
                    String result = Evaluator.checker(userInput, numList, i); // first check index [1]
                    // System.out.println("if " + numList.get(i)); // for testing

                    if (result.equals("Correct"))
                    {
                        output = output + ", " + numList.get(i).toString() + ":" + userInput + ":" + result;
                        System.out.println(output);
                        correctCounter += 1;
                        
                    }
                    else if (result.equals("Wrong"))
                    {
                        output = output + ", " + numList.get(i).toString() + ":" + userInput + ":" + result;
                        System.out.println(output);
                        wrongCounter += 1;
                    }

                    System.out.println("------------------------");
                    System.out.printf("| Correct: %s | Wrong: %s |\n", correctCounter, wrongCounter);
                    System.out.println("------------------------");
                }
                else
                {
                    System.out.println("please key in only 'h' or 'l'");
                    // System.out.println("else 1 " + numList.get(i)); // for testing
                    i -= 1; // check same index again
                    // System.out.println("else 2 " + numList.get(i)); // for testing
                }                  
            }
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
