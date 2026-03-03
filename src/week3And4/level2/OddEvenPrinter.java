package week3And4.level2;

import java.util.Scanner;

public class OddEvenPrinter {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check for natural number
        if (number <= 0) {
            System.out.println("The number " + number + " is not a Natural Number");
        } else {
            // Use for loop to iterate from 1 to number and check odd/even
            for (int i = 1; i <= number; i++) {
                if (i % 2 == 0) {
                    System.out.println(i + " is an Even Number");
                } else {
                    System.out.println(i + " is an Odd Number");
                }
            }
        }

        // Close Scanner
        input.close();
    }
}
