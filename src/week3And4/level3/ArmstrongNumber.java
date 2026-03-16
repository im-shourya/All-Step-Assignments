package week3And4.level3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define sum variable initialized to 0 and originalNumber to hold input
        int sum = 0;
        int originalNumber = number;

        // Use while loop to compute sum of cubes of each digit
        while (originalNumber != 0) {
            // Get last digit using modulus
            int digit = originalNumber % 10;

            // Add cube of digit to sum
            sum += digit * digit * digit;

            // Remove last digit using division
            originalNumber = originalNumber / 10;
        }

        // Check if sum equals the original number
        if (sum == number) {
            System.out.println("The number " + number + " is an Armstrong Number");
        } else {
            System.out.println("The number " + number + " is not an Armstrong Number");
        }

        // Close Scanner
        input.close();
    }
}
