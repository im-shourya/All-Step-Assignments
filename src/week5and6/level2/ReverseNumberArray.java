package week5and6.level2;

import java.util.Scanner;

/**
 * Level 2 Practice Program 5
 * Reverse a number by storing its digits in an array, 
 * moving them to a reversed array, and displaying it.
 */
public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // User Input Capture
        System.out.print("Enter a positive number to reverse: ");
        if (!scanner.hasNextInt()) {
            System.err.println("Fatal Error: Must provide a valid integer.");
            System.exit(1);
        }
        
        int inputNumber = scanner.nextInt();
        // Logical rule bounds validation
        if (inputNumber < 0) {
            System.err.println("Fatal Error: Required a positive number inherently.");
            System.exit(1);
        }
        
        int digitCount = 0;
        int tempNumber = inputNumber;
        
        // 1. Determining length requirement for arrays
        if (tempNumber == 0) {
            digitCount = 1;
        } else {
            while (tempNumber > 0) {
                digitCount++;
                tempNumber /= 10;
            }
        }
        
        // 2. Extract digits (the modulo pulls right-to-left)
        int[] digitsArray = new int[digitCount];
        tempNumber = inputNumber;
        
        // Build raw component elements based computationally
        for (int i = digitCount - 1; i >= 0; i--) {
            digitsArray[i] = tempNumber % 10;
            tempNumber /= 10;
        }
        
        // 3. Create secondary isolated array for reversed standard formatting 
        int[] reversedDigits = new int[digitCount];
        for (int i = 0; i < reversedDigits.length; i++) {
            reversedDigits[i] = digitsArray[digitsArray.length - 1 - i];
        }
        
        // Output formatting validation strictly using length property loop rules
        System.out.print("Reversed Array Elements Output Display: ");
        for (int i = 0; i < reversedDigits.length; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println(); // Trailing blank log formatting block
        
        scanner.close();
    }
}
