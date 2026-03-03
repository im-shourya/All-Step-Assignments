package week3And4.level1;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get 3 number inputs from user
        System.out.print("Enter number1: ");
        int number1 = input.nextInt();

        System.out.print("Enter number2: ");
        int number2 = input.nextInt();

        System.out.print("Enter number3: ");
        int number3 = input.nextInt();

        // Check which number is the largest using logical operators
        boolean isFirstLargest  = (number1 > number2) && (number1 > number3);
        boolean isSecondLargest = (number2 > number1) && (number2 > number3);
        boolean isThirdLargest  = (number3 > number1) && (number3 > number2);

        // Print the results
        System.out.println("Is the first number the largest?  " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest?  " + isThirdLargest);

        // Close Scanner
        input.close();
    }
}
