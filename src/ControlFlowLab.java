import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowLab {
    public static void main(String[] args) {
// Get user to input a number
        System.out.println("Welcome to guess the Secret Number!");
        System.out.println("Guess the secret number, which is between 0 and 20 and input your guesses below :)");
// Collect user input - using the Scanner reader
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int secretNumber = parseInt(input);
//        int secretNumber = reader.nextInt();
//// Create the secret number - will be number 7
// Let the user know if their guess is too high
// Let the user know if their guess is too low
// Let the user know if they have guessed it correctly
        if (secretNumber > 9) {
            System.out.println("Too high, guess again!");
        } else if (secretNumber < 5) {
            System.out.println("Too low, you've got to try again I'm afraid!");
        } else if (secretNumber == 7) {
            System.out.println("Correct! Well done :)");
        } else if (secretNumber == 5) {
            System.out.println("Close... but not close enough");
        } else if (secretNumber == 6) {
            System.out.println("You're even closer this time... but still not close enough");
        } else if (secretNumber == 8) {
            System.out.println("Ohh you're a little bit too high there, but you are close!");
        } else if (secretNumber == 9) {
            System.out.println("You're close... but not close enough sadly!");
        }

    }
}
