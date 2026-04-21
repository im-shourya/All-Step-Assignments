package week5and6.level2;

import java.util.Scanner;

/**
 * Level 3 Practice Program 1: Matrix Multiplication
 * This program demonstrates advanced 2D array usage by multiplying two matrices.
 * It includes structural matrix dimension validation, element input validation,
 * and computation logic using nested loops and lengths properties.
 */
public class MatrixMultiplication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("--- Matrix Multiplication ---");
        
        // --- Matrix A Initialization ---
        System.out.print("Enter number of rows for Matrix A: ");
        if (!scanner.hasNextInt()) { System.err.println("Error: Integer required."); System.exit(1); }
        int rowsA = scanner.nextInt();
        
        System.out.print("Enter number of columns for Matrix A: ");
        if (!scanner.hasNextInt()) { System.err.println("Error: Integer required."); System.exit(1); }
        int colsA = scanner.nextInt();
        
        if (rowsA <= 0 || colsA <= 0) {
            System.err.println("Error: Matrix dimensions must be strictly positive.");
            System.exit(1);
        }
        
        int[][] matrixA = new int[rowsA][colsA];
        
        // --- Matrix B Initialization ---
        System.out.print("\nEnter number of rows for Matrix B: ");
        if (!scanner.hasNextInt()) { System.err.println("Error: Integer required."); System.exit(1); }
        int rowsB = scanner.nextInt();
        
        System.out.print("Enter number of columns for Matrix B: ");
        if (!scanner.hasNextInt()) { System.err.println("Error: Integer required."); System.exit(1); }
        int colsB = scanner.nextInt();
        
        if (rowsB <= 0 || colsB <= 0) {
            System.err.println("Error: Matrix dimensions must be strictly positive.");
            System.exit(1);
        }
        
        // --- Mathematical Rule Validation ---
        if (colsA != rowsB) {
            System.err.println("Fatal Error: Matrix Multiplication impossible. Columns of A must equal Rows of B.");
            System.exit(1);
        }
        
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsB]; // Result is size RowsA x ColsB
        
        // --- Input Population Loop for Matrix A ---
        System.out.println("\nPopulating Matrix A (" + matrixA.length + "x" + matrixA[0].length + "):");
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                if (!scanner.hasNextInt()) { System.err.println("Error: Integer required."); System.exit(1); }
                matrixA[i][j] = scanner.nextInt();
            }
        }
        
        // --- Input Population Loop for Matrix B ---
        System.out.println("\nPopulating Matrix B (" + matrixB.length + "x" + matrixB[0].length + "):");
        for (int i = 0; i < matrixB.length; i++) {
            for (int j = 0; j < matrixB[i].length; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                if (!scanner.hasNextInt()) { System.err.println("Error: Integer required."); System.exit(1); }
                matrixB[i][j] = scanner.nextInt();
            }
        }
        
        // --- Computation Execution ---
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixB[0].length; j++) {
                for (int k = 0; k < matrixA[0].length; k++) {
                    // Result equals the dot product of A's rows and B's columns
                    resultMatrix[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        
        // --- Output Generation ---
        System.out.println("\n--- Final Matrix Result (" + resultMatrix.length + "x" + resultMatrix[0].length + ") ---");
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                System.out.print(resultMatrix[i][j] + "\t");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
