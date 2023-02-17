/*---------------------------------------------------------------------
    Title: Alex Myers
    Author: Alex Myers
    Date: 20 Feb 2023
    Course & Section: CSC 112-303
    Description: Prompt for 10 integers, store into string, convert to integer,
            and use exception recovery to return to loop if a bad input is made.
    Initial Algorithm:
    import scanner
        declare variables
        instantiate scanner
        begin do while count < 10
            begin try
                prompt integer input
                store to string
                increment count
                convert and store to integer
            end try
            begin catch
                print error message
            end catch
        end do while

    Data Requirements:
        Input Instance Data:
            String stringBeforeParse: stores the input before being converted to integer
        Additional Instance Data or Variables
            int convertedStringInput: stores the input after parseInt
            int counter: counts number of times loop has succeeded
---------------------------------------------------------------------*/

import java.util.Scanner;

public class ParseInt_Error
{
        /*---------------------------------------------------------------------
        Title: main
        Author: Alex Myers
        Description: performs logic within a loop to convert 10 string inputs
                    to an integer variable, if the string contains a non-integer
                    input, output an error message and return to loop.

        Refined Algo:
        Import Scanner class
          BEGIN MAIN
                1. DATA DECLARATION:
                    String stringBeforeParse
                    int convertedStringInput
                    int counter
                instantiate object of Scanner
                counter = 0
                2. BEGIN DO WHILE
                    3. BEGIN TRY
                        PRINT "Enter an integer value"
                        Input to stringBeforeParse
                        parseInt stringBeforeParse -> convertedStringInput
                        counter++
                    END TRY
                    4. BEGIN CATCH
                        PRINT "You tried to input a non-integer!"
                        PRINT exception
                    END CATCH
                END DO WHILE (count < 10)
            END MAIN
    ---------------------------------------------------------------------*/
    public static void main(String[] args)
    {
        // DATA DECLARATION
        String stringBeforeParse; // Stores input before parseInt
        int convertedStringInput; // Stores input after parseInt
        int counter; // Keeps track of amount of times a new valid input has been made
        
        Scanner input = new Scanner(System.in);
        
        counter = 0; // Sets counter to 0 to begin loop
        do
        {
            try // Begin exception handling
            {
                System.out.print("Enter an integer value: (" + (10 - counter) + " remaining)\t"); // Prompts input and displays # remaining
                stringBeforeParse = input.next(); // Input for integer as string
                convertedStringInput = Integer.parseInt(stringBeforeParse); // Convert input into integer variable
                counter++; // Increment the counter if error does not occur
            }
            catch (NumberFormatException problem) // Output error message when input includes non-integer
            {
                System.out.println("You entered something that wasn't an integer." + problem.getMessage());
            }
        } while (counter < 10); // Checks counter for if loop continues
    }
}