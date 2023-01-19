import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowLab {
    public static void main(String[] args) {
// Get user to input a number
        System.out.println("Guess the secret number [0-20], input your guesses below");
// Collect user input - using the Scanner reader
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int secretNumber = parseInt(input);
//        int secretNumber = reader.nextInt();
//// Create the secret number - will be number 7
// Let the user know if their guess is too high
// Let the user know if their guess is too low
// Let the user know if they have guessed it correctly
        if (secretNumber > 7) {
            System.out.println("Too high");
        } else if (secretNumber < 5) {
            System.out.println("Too low");
        } else if (secretNumber == 7) {
            System.out.println("Correct!");
        } else if (secretNumber == 5) {
            System.out.println("Close... but not close enough");
        } else if (secretNumber == 6) {
            System.out.println("You're even closer this time... but still not close enough");
        }

    }
}
