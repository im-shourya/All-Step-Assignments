package week3And4.level1;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get number input from user
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is divisible by 5 and print result
        boolean isDivisibleByFive = (number % 5 == 0);
        System.out.println("Is the number " + number + " divisible by 5? " + isDivisibleByFive);

        // Close Scanner
        input.close();
    }
}
