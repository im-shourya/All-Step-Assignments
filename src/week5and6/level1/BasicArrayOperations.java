package week5and6.level1;

import java.util.Scanner;

/**
 * Problem Statement 1: Basic Array Operations
 * This program demonstrates creating a 1D array, accessing its elements,
 * iterating with a for-loop utilizing its length property, and modifying its contents.
 */
public class BasicArrayOperations {

    public static void main(String[] args) {
        // Variable Declaration
        Scanner inputScanner = new Scanner(System.in);
        int arraySize = 5; // Fixed size based on requirement
        int[] numberArray; 
        
        // 1 & 2. Java Arrays & Create an Array Initialization
        numberArray = new int[arraySize];
        
        // 6. Using length property of array in output
        System.out.println("Please enter " + numberArray.length + " integer values:");
        
        // 4. Accessing using for loop (using their length property)
        for (int index = 0; index < numberArray.length; index++) {
            System.out.print("Enter value for index " + index + ": ");
            
            // 7. Validate user input
            if (!inputScanner.hasNextInt()) {
                // 10. Using Java System error() message and exit() method
                System.err.println("Error: Invalid input entered. An integer was expected.");
                System.exit(1);
            }
            
            int userInput = inputScanner.nextInt();
            // 3 & 5. Access and Modifying array at specific index
            numberArray[index] = userInput;
        }
        
        System.out.println("\nArray contents after modification:");
        // Loop to access and display elements using array length property
        for (int index = 0; index < numberArray.length; index++) {
            int currentElement = numberArray[index];
            System.out.println("Element at index " + index + " is: " + currentElement);
        }
        
        // Close scanner memory
        inputScanner.close();
    }
}
