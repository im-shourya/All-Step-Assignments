package week5and6.level2;

import java.util.Scanner;

/**
 * Level 2 Practice Program 2
 * Find the youngest and tallest among 3 friends.
 */
public class FriendsAnalysis {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        // Direct initialization of given criteria parameters
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int totalFriends = friends.length;
        
        // Declaring dependent Arrays
        int[] ages = new int[totalFriends];
        double[] heights = new double[totalFriends];
        
        // Input Phase with strictly validated System exits as per best practice rules
        for (int i = 0; i < totalFriends; i++) {
            System.out.println("Enter details for " + friends[i] + ":");
            
            System.out.print("Age (integer): ");
            // Age integrity checks
            if (!inputScanner.hasNextInt()) {
                System.err.println("Fatal Error: Age must be an integer.");
                System.exit(1);
            }
            ages[i] = inputScanner.nextInt();
            
            System.out.print("Height (e.g. 5.8): ");
            // Height integrity checks
            if (!inputScanner.hasNextDouble()) {
                System.err.println("Fatal Error: Height must be a decimal (double).");
                System.exit(1);
            }
            heights[i] = inputScanner.nextDouble();
        }
        
        // Logic Processing Phase initialized at beginning elements natively
        int youngestIdx = 0;
        int tallestIdx = 0;
        
        // Length property looping for calculations
        for (int i = 1; i < totalFriends; i++) {
            // Assess youngest metric
            if (ages[i] < ages[youngestIdx]) {
                youngestIdx = i;
            }
            // Assess tallest metric
            if (heights[i] > heights[tallestIdx]) {
                tallestIdx = i;
            }
        }
        
        // Output Phase rendering the findings
        System.out.println("\n--- Analysis Results ---");
        System.out.println("The youngest friend is " + friends[youngestIdx] + " with an age of " + ages[youngestIdx] + " years.");
        System.out.println("The tallest friend is " + friends[tallestIdx] + " with a height of " + heights[tallestIdx] + ".");
        
        inputScanner.close();
    }
}
