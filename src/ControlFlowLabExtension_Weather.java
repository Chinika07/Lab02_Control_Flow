import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ControlFlowLabExtension_Weather {
    public static void main(String[] args) {
// Get user to input information about the weather and avg. temperature
        System.out.println("What is the weather like today and what is the current temperature?");

        // Collect user input using the Scanner reader
        Scanner reader = new Scanner(System.in);
        String input = reader.nextLine();
        int temperature = parseInt(input);
        String weather = reader.nextLine();

        if (weather == "windy" && temperature == 5) {
            System.out.println("A light jacket will do");
        } else if (weather == "windy" && temperature == 6); {
            System.out.println("A light jacket will do");
        }

    }
}

