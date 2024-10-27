package Task13;

import java.io.BufferedReader;
import java.io.Console;
import java.io.File;
import java.io.FileReader;
import java.io.Reader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HangmanMain {
    public static void main(String[] args) 
    {
        while (true) 
        {
            boolean restart = false;

            while (!restart)
            {
                // Reference to a file
                // Path p = Paths.get("Words.txt"); // provided only file name, no path, it looked in current working dir
                
                // p is path obj
                Path p = Paths.get("src/Task13/Words.txt");

                try 
                {
                    if(!Files.exists(p)) // if file DNE
                    {
                        Files.createDirectories(p.getParent()); // Create parent directories if DNE
                        Files.createFile(p); // Create file

                        System.out.println("File created: " + p.toAbsolutePath()); // Show where it's created
                    }
                    else
                    {
                        System.out.println("File already exist: " + p.toAbsolutePath()); // Show where it is
                    }
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }

                // Get the file
                File f = p.toFile();

                // Information on the file
                System.out.printf("Absolute path: %s \n", f.getAbsolutePath());
                System.out.printf("Name: %s \n", f.getName());
                System.out.printf("File size: %d \n", f.length());
                
                try (Reader reader = new FileReader(f);
                BufferedReader br = new BufferedReader(reader);
                ) {
                    String line = br.readLine();;

                    while(line != null) // end of file
                    {
                        System.out.println(line);
                        line = br.readLine();
                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

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
