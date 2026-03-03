package week3And4.level2;

import java.util.Scanner;

public class FizzBuzzFor {
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
            // Use for loop: print Fizz, Buzz, FizzBuzz or the number
            for (int i = 1; i <= number; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        // Close Scanner
        input.close();
    }
}
