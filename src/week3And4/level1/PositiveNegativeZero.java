package week3And4.level1;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is positive, negative, or zero using if-else if-else
        if (number > 0) {
            System.out.println("The number " + number + " is Positive");
        } else if (number < 0) {
            System.out.println("The number " + number + " is Negative");
        } else {
            System.out.println("The number is Zero");
        }

        // Close Scanner
        input.close();
    }
}
