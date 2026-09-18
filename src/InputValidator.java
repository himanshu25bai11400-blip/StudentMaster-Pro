import java.util.Scanner;

public class InputValidator {
    public static int getValidInt(Scanner scanner, String prompt, int min, int max) {
        int input;
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                input = scanner.nextInt();
                if (input >= min && input <= max) {
                    return input;
                }
            } else {
                scanner.next(); // clear invalid input
            }
            System.out.println("❌ Invalid input. Please enter a number between " + min + " and " + max + ".");
        }
    }
}
