package week3And4.level2;

import java.util.Scanner;

public class FactorsFinder {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input from user
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Check for positive integer
        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer");
        } else {
            // Use for loop to find all factors from 1 to number-1
            System.out.println("Factors of " + number + " are:");
            for (int i = 1; i < number; i++) {
                // Check if i is a factor of number
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        // Close Scanner
        input.close();
    }
}
