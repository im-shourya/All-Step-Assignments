package week3And4.level3;

import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Prime numbers are greater than 1
        if (number <= 1) {
            System.out.println("The number " + number + " is not a Prime Number");
        } else {
            // Use boolean variable to track prime status
            boolean isPrime = true;

            // Loop from 2 to number-1 to check for divisors
            for (int i = 2; i < number; i++) {
                // If number is divisible by i, it is not prime
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // Print the result
            if (isPrime) {
                System.out.println("The number " + number + " is a Prime Number");
            } else {
                System.out.println("The number " + number + " is not a Prime Number");
            }
        }

        // Close Scanner
        input.close();
    }
}
