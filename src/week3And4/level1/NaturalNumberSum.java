package week3And4.level1;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is a natural number (positive integer)
        if (number > 0) {
            // Compute sum of n natural numbers using formula
            int sumOfNaturalNumbers = number * (number + 1) / 2;

            // Print the result
            System.out.println("The sum of " + number + " natural numbers is " + sumOfNaturalNumbers);
        } else {
            // Print not a natural number message
            System.out.println("The number " + number + " is not a natural number");
        }

        // Close Scanner
        input.close();
    }
}
