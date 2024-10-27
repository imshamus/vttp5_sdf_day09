package Task13;

import java.io.Console;

public class RestartTemp {
    public static void main(String[] args) 
    {
        while (true) 
        {
            boolean restart = false;

            while (!restart)
            {
                
                

                System.out.println("Welcome to Hangman");

                restart = restart();

                    if (restart == false)
                    {
                        return; // end program
                    }

            }
        }
    }

    public static boolean restart()
    {
        Console cons = System.console();

        while (true)
        {
            System.out.println("Restart? Y/N");
            String userInput = cons.readLine(">>> ").toLowerCase();

            if (userInput.equals("y"))
            {
                return true;
            }
            else if (userInput.equals("n"))
            {
                System.out.println("Thank you for playing.");
                return false;
            }
            else
            {
                System.out.println("Please enter only 'y' or 'n'.");
            }
        }
    }
    
}
