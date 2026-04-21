package week5and6.level2;

import java.util.Scanner;

/**
 * Level 2 Practice Program 1
 * Calculate bonuses, new salaries, and total payout for 10 employees.
 */
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalEmployees = 10;
        
        // Define arrays for data tabularization
        double[] oldSalary = new double[totalEmployees];
        double[] yearsOfService = new double[totalEmployees];
        double[] newSalary = new double[totalEmployees];
        double[] bonusAmount = new double[totalEmployees];
        
        // Summarization values variables
        double totalBonusPayout = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        
        System.out.println("--- Employee Bonus Calculator ---");
        
        // Input Loop setup for Data gathering
        for (int i = 0; i < totalEmployees; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            
            System.out.print("Enter Salary: ");
            // Validation implementation
            if (!input.hasNextDouble()) {
                System.err.println("Invalid salary input. Please enter valid digits.");
                input.next(); // Clear invalid input
                i--; // Decrement index to re-attempt this iteration
                continue;
            }
            double salaryInput = input.nextDouble();
            if (salaryInput < 0) {
                System.err.println("Salary cannot be negative. Please try again.");
                i--; // Decrement index to re-attempt this iteration
                continue;
            }
            
            System.out.print("Enter Years of Service: ");
            // Validation implementation
            if (!input.hasNextDouble()) {
                System.err.println("Invalid years input. Please enter valid digits.");
                input.next(); // Clear invalid input
                i--; // Decrement index to re-attempt
                continue;
            }
            double yearsInput = input.nextDouble();
            if (yearsInput < 0) {
                System.err.println("Years of service cannot be negative. Please try again.");
                i--; // Decrement index to re-attempt
                continue;
            }
            
            // Assign successful inputs
            oldSalary[i] = salaryInput;
            yearsOfService[i] = yearsInput;
        }
        
        System.out.println("\n--- Processing Results ---");
        // Separation logic loop for applying Bonuses per rules
        for (int i = 0; i < totalEmployees; i++) {
            double currentBonus = 0;
            // Zara standard conditional threshold evaluation
            if (yearsOfService[i] > 5) {
                currentBonus = oldSalary[i] * 0.05;
            } else {
                currentBonus = oldSalary[i] * 0.02;
            }
            
            // Reassign modified array values
            bonusAmount[i] = currentBonus;
            newSalary[i] = oldSalary[i] + currentBonus;
            
            // Append totals
            totalBonusPayout += currentBonus;
            totalOldSalary += oldSalary[i];
            totalNewSalary += newSalary[i];
        }
        
        // Standard data extraction printing loop
        for (int i = 0; i < bonusAmount.length; i++) {
             System.out.println("Employee " + (i + 1) + " | Old Salary: $" + oldSalary[i] + " | Bonus: $" + bonusAmount[i] + " | New Salary: $" + newSalary[i]);
        }
        
        System.out.println("\n--- Zara Company Aggregated Summaries ---");
        System.out.println("Total Old Salary Payout: $" + totalOldSalary);
        System.out.println("Total Bonus Payout: $" + totalBonusPayout);
        System.out.println("Total New Salary Payout: $" + totalNewSalary);
        
        input.close();
    }
}
