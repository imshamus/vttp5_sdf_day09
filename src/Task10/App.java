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
        while (true)
        {
            
            boolean restart = false;

            while(!restart)
            {
                
                // Start generating 10 numbers
                List<Integer> numList = GenRandom();
                // System.out.println("List: " + numList);  

                // Shuffles the list
                Collections.shuffle(numList);
                // System.out.println("Shuffled List: " + numList);  

                // initialise vars
                int correctCounter = 0;     // Score counter for correct guesses
                int wrongCounter = 0;       // Score counter for wrong guesses
                int amtHigher = 0;          // For counting amt of values higher
                int amtLower = 0;           // For counting amt of values lower
                int amtSame =0;             // For counting amt of values same

                int referenceNum = numList.get(0);
                String output = Integer.toString(referenceNum); // Base output from shuffled list for appending results

                for(int i = 1; i < numList.size(); i++) // ask user high or low for each number in list
                {
                    if(referenceNum < numList.get(i))
                    {
                        amtHigher++;
                    }
                    else if (referenceNum > numList.get(i)) 
                    {
                        amtLower++;
                    }
                    else if (referenceNum == numList.get(i))
                    {
                        amtSame++;
                    }
                }

                for(int i = 1; i < numList.size(); i++) // ask user high or low for each number in list
                {   
                    // Get first number in list as reference
                    System.out.println("Reference number: " + referenceNum);
                    // System.out.println("Next number: " + numList.get(i)); // for testing

                    // Show how many higher, lower, or same value as reference number
                    System.out.printf("No. of higher: %s | No. of lower: %s | No. of same: %s \n", amtHigher, amtLower, amtSame);

                    // Prompt
                    System.out.println("Is next number 'h' or 'l' or 's'?");
                    
                    // Get user's input
                    String userInput = cons.readLine(">>> ");
                    userInput= userInput.toUpperCase(); 


                    if (userInput.equals("H") || userInput.equals("L") || userInput.equals("S"))
                    {
                        String result = Evaluator.checker(userInput, numList, i); // first check index [1]
                        // System.out.println("if " + numList.get(i)); // for testing

                        if (result.equals("Correct"))
                        {
                            output = output + ", " + numList.get(i).toString() + ":" + userInput + ":" + result;
                            System.out.println(output);
                            correctCounter += 1;
                            
                            switch (userInput) 
                            {
                                case "H":
                                    amtHigher -= 1;
                                    break;

                                case "L":
                                    amtLower -= 1;
                                    break;

                                case "S":
                                    amtSame -= 1;
                                    break;

                                default:
                                    break;
                            }
                        }

                        else if (result.equals("Wrong"))
                        {
                            output = output + ", " + numList.get(i).toString() + ":" + userInput + ":" + result;
                            System.out.println(output);
                            wrongCounter += 1;

                            if (numList.get(i) > referenceNum)
                            {
                                amtHigher -= 1;
                            }
                            else if (numList.get(i) < referenceNum)
                            {
                                amtLower -= 1;
                            }
                            else if (numList.get(i) == referenceNum)
                            {
                                amtSame -= 1;
                            }
                        }

                        else if(result.equals("Invalid"))
                        {
                            System.out.println("Something went wrong with Evaluator.java. Please try again.");
                            i -= 1; // check same index again
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

                while(true)
                {
                    System.out.println("Restart? (y/n)");
                    String userInput = cons.readLine(">>> ").toUpperCase();
                    
                    if (userInput.equals("Y"))
                    {
                        restart = true;
                        break;
                    }
                    else if (userInput.equals("N"))
                    {
                        System.out.println("Thank you for playing.");
                        return; // Exit the program
                    }
                    else
                    {
                        System.out.println("Please enter only 'y' or 'n'.");
                    }
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
}
