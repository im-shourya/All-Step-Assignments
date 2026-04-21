package week5and6.level1;

import java.util.Scanner;

/**
 * Problem Statement 3: Dynamic Array Sum
 * This program asks the user for the size of an array, creates it dynamically,
 * populates it with user inputs with strict validation, and computes the result sum.
 */
public class DynamicArraySum {

    public static void main(String[] args) {
        // Variable Declaration
        Scanner inputScanner = new Scanner(System.in);
        int userArraySize = 0;
        int[] dynamicArray;
        int sumResult = 0;
        
        System.out.print("Enter the desired size of the array (must be positive): ");
        
        // Validate array size input to ensure the user does not provide invalid data types
        if (!inputScanner.hasNextInt()) {
            System.err.println("Fatal Error: Input must be a valid integer.");
            System.exit(1);
        }
        
        userArraySize = inputScanner.nextInt();
        
        // Additional validation to prevent negative lengths natively
        if (userArraySize <= 0) {
            System.err.println("Fatal Error: Array size must be a positive integer greater than zero.");
            System.exit(1);
        }
        
        // Create an Array dynamically based on user input
        dynamicArray = new int[userArraySize];
        
        System.out.println("Please enter " + dynamicArray.length + " integer values:");
        
        // Populate the array with validated user input
        for (int i = 0; i < dynamicArray.length; i++) {
            System.out.print("Enter value " + (i + 1) + ": ");
            
            if (!inputScanner.hasNextInt()) {
                System.err.println("Fatal Error: Invalid input detected during array population.");
                System.exit(1);
            }
            
            int inputValue = inputScanner.nextInt();
            // Modify array at the generated index
            dynamicArray[i] = inputValue;
        }
        
        // Calculate the result (sum of elements)
        for (int i = 0; i < dynamicArray.length; i++) {
            // Accessing array elements sequentially
            sumResult += dynamicArray[i];
        }
        
        // Print Final Value
        System.out.println("The sum result of all elements in the array is: " + sumResult);
        
        // Close scanner
        inputScanner.close();
    }
}
