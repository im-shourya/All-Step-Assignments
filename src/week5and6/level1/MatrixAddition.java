package week5and6.level1;  

import java.util.Scanner;

/**
 * Problem Statement 4: Matrix Addition
 * This program demonstrates multi-dimensional arrays by creating two matrices,
 * taking input for them, and performing matrix addition.
 */
public class MatrixAddition {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        
        // Fixed dimensions for the Matrices
        int fixedRows = 2;
        int fixedCols = 2;
        
        // Declaration of 2D Arrays (Matrices)
        int[][] firstMatrix = new int[fixedRows][fixedCols];
        int[][] secondMatrix = new int[fixedRows][fixedCols];
        int[][] resultMatrix = new int[fixedRows][fixedCols];
        
        System.out.println("Matrix Addition Program (" + fixedRows + "x" + fixedCols + ")");
        
        // Input loop for first matrix utilizing array length for iteration
        System.out.println("Enter values for First Matrix:");
        for (int i = 0; i < firstMatrix.length; i++) {
            for (int j = 0; j < firstMatrix[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                
                if (!inputScanner.hasNextInt()) {
                    System.err.println("Fatal Error: Expected an integer value.");
                    System.exit(1);
                }
                
                firstMatrix[i][j] = inputScanner.nextInt();
            }
        }
        
        // Input loop for second matrix
        System.out.println("\nEnter values for Second Matrix:");
        for (int i = 0; i < secondMatrix.length; i++) {
            for (int j = 0; j < secondMatrix[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                
                if (!inputScanner.hasNextInt()) {
                    System.err.println("Fatal Error: Expected an integer value.");
                    System.exit(1);
                }
                
                secondMatrix[i][j] = inputScanner.nextInt();
            }
        }
        
        // Result Computation via Array Access and Modification
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        
        // Output the resulting array computation
        System.out.println("\nResult Matrix after Addition:");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println(); // Next row
        }
        
        inputScanner.close();
    }
}
