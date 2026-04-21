package week5and6.level1;

import java.util.Scanner;

/**
 * Problem Statement 2: Two Dimensional Array Demo
 * This program demonstrates creating a 2D array, accessing its elements,
 * finding its dimensions (rows and columns), and printing matrix values.
 */
public class TwoDimensionalArrayDemo {

    public static void main(String[] args) {
        // Variable Declaration
        Scanner inputScanner = new Scanner(System.in);
        int numberOfRows = 2; // Fixed requirement
        int numberOfColumns = 3; // Fixed requirement
        int[][] matrixArray;
        
        // 7 & 8. Java Multi-dimensional Array & 2 Dimensional Array (Matrix) Initialization
        matrixArray = new int[numberOfRows][numberOfColumns];
        
        System.out.println("Please enter integer values for a " + numberOfRows + "x" + numberOfColumns + " matrix:");
        
        // 9. Finding size of multi-dimensional array
        int rowSize = matrixArray.length;
        
        // Nested loop to accept user inputs into the 2D array
        for (int rowIndex = 0; rowIndex < rowSize; rowIndex++) {
            
            // 9. Accessing size of nested array within Multi-Dimensional Array
            int columnSize = matrixArray[rowIndex].length;
            
            for (int colIndex = 0; colIndex < columnSize; colIndex++) {
                System.out.print("Enter value for position [" + rowIndex + "][" + colIndex + "]: ");
                
                // Validate user input against erroneous values
                if (!inputScanner.hasNextInt()) {
                    System.err.println("Error: Invalid input entered. An integer was expected.");
                    System.exit(1);
                }
                
                int userInput = inputScanner.nextInt();
                // Modifying 2D array elements based on nested indices
                matrixArray[rowIndex][colIndex] = userInput;
            }
        }
        
        System.out.println("\nThe entered Multi-Dimensional Array (Matrix) is:");
        // Displaying the 2D Array Matrix visually
        for (int rowIndex = 0; rowIndex < matrixArray.length; rowIndex++) {
            for (int colIndex = 0; colIndex < matrixArray[rowIndex].length; colIndex++) {
                // Accessing 2D Array
                int currentElement = matrixArray[rowIndex][colIndex];
                System.out.print(currentElement + "\t");
            }
            // Move to the next line for the next row
            System.out.println();
        }
        
        // Close scanner reference
        inputScanner.close();
    }
}
