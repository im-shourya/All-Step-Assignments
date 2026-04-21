package week5and6.level3;

import java.util.Scanner;

/**
 * Level 3 Practice Program 1
 * Calculate the frequency of each digit in a given number using arrays.
 */
public class DigitFrequency {

    public static void main(String[] args) {
        // Variable Definitions and Instantiations
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive number to find digit frequencies: ");
        
        // Input validation for integer constraint
        if (!scanner.hasNextInt()) {
            System.err.println("Fatal Error: The input must be a valid integer.");
            System.exit(1);
        }
        int inputNumber = scanner.nextInt();
        
        // Input validation for positive constraint
        if (inputNumber < 0) {
            System.err.println("Fatal Error: Negative numbers are not supported in this operation.");
            System.exit(1);
        }
        
        // Copy variable to avoid modifying original value for count extraction
        int tempNumberForCount = inputNumber;
        int digitCount = 0;
        
        // Special condition for 0
        if (tempNumberForCount == 0) {
            digitCount = 1;
        } else {
            // Count total digits utilizing while loop
            while (tempNumberForCount > 0) {
                digitCount++;
                tempNumberForCount /= 10;
            }
        }
        
        // Dynamically instantiate digit tracking array
        int[] digitsArray = new int[digitCount];
        int tempNumberForExtract = inputNumber;
        
        // Loop to extract raw digits from number into storage array
        for (int i = 0; i < digitsArray.length; i++) {
            digitsArray[i] = tempNumberForExtract % 10;
            tempNumberForExtract /= 10;
        }
        
        // Define frequency tally array (Indices 0 through 9 represent digits 0-9)
        int[] frequencyArray = new int[10];
        
        // Tally frequency of digits using the values extracted
        for (int i = 0; i < digitsArray.length; i++) {
            int currentDigit = digitsArray[i];
            // Increment the frequency slot matching the digit
            frequencyArray[currentDigit]++; 
        }
        
        // Loop to display results referencing length properties cleanly
        System.out.println("\n--- Digit Frequency Results ---");
        for (int i = 0; i < frequencyArray.length; i++) {
            // Display only numbers that actually exist in the frequency block
            if (frequencyArray[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequencyArray[i] + " time(s).");
            }
        }
        
        scanner.close();
    }
}
