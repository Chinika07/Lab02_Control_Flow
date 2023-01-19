import java.sql.SQLOutput;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowLabExtension_Weather {
    public static void main(String[] args) {
// Get user to input information about the weather and avg. temperature
        System.out.println("Welcome to the C8 Weather App!");
        System.out.println("Do you need guidance on what to wear outside? Well you are at the right place :).");
        System.out.println("Please enter the details below so we can help.");

        // Collect user input using the Scanner reader
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the average temperature here (degrees Celsius):");
        String input = reader.nextLine();
        int temperature = parseInt(input); // temp is changing to int here
        System.out.println("Enter the weather below:");
        String weather = reader.nextLine();

        if (weather.equals("Windy") && temperature <= 11) {
            System.out.println("A coat is needed I'm afraid!");
        } else if (weather.equals("Windy") && temperature >= 12) {
            System.out.println("A light jacket will do.");

        } else if (weather.equals("Snowing") && temperature <= 2) {
            System.out.println("Wrap up warm, snow has arrived!");

        } else if (weather.equals("Raining") && temperature < 12) {
            System.out.println("You'll need a coat to keep you warm and dry.");
        } else if (weather.equals("Raining") && temperature >= 12) {
            System.out.println("Grab a light jacket... but don't forget a hood!");

        } else if (weather.equals("Sunny") && temperature < 15) {
            System.out.printf("The sun is out but don't be fooled... take a light jacket just in case.");
        } else if (weather.equals("Sunny") && temperature >= 15) {
            System.out.println("It's your lucky day, you should be able to survive without a jacket!");

        } else {
            System.out.println("Error!");
        }

    }
}

