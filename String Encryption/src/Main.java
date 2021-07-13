import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
            //Importing scanner.
        Scanner scan = new Scanner(System.in);

            //Printing welcome message and prompting the user to input a string of their choosing.
        System.out.println("Hello! Welcome to string encryption!\n\nEnter any string here:");

            //Setting up a variable to intake the user's string.
        String userCode = (scan.next());

            //Setting up a variable to take a portion of the string used for the encryption.
        String move = (userCode.substring(0,1));

            //Presenting the encrypted code with adds "owaowa" to the beginning of the user's input and adds the first character to the end.
        System.out.println("The encrypted code:" + "owaowa" + userCode + move);

            //Asking the user whether or not they would like to see their code reverted to the initial input.
        System.out.println("\nWould you like to revert your code? Please respond with \'Yes\' or \'No\'?");

            //Looping the request until a "Yes" or "No" option is properly inputted.
        while (true) {
                //Taking in the user's choice.
            String choice = (scan.next());

                //Printing goodbye message and stopping the program if the user selects "No".
            if (choice.equals("No")) {
                System.out.println("\nAlright! Thank you for using string encryption.");
                break;
            }

                //Printing the original string, a goodbye message, and stopping the program if the user selects "Yes".
            else if (choice.equals("Yes")) {
                System.out.println("\nThe original string: " + userCode + "\nThank you for using string encryption.");
                break;
            }

                //Requesting that the user re-inputs either "Yes" or "No" if they enter anything else.
            else {
                System.out.println("\nInvalid selection. Please enter either \'Yes\' or \'No\'.");
            }
        }
    }
}
