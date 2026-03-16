package week3And4.level3;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get year input from user
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        // Check for valid Gregorian calendar year (>= 1582)
        if (year < 1582) {
            System.out.println("The year " + year + " is not a valid Gregorian calendar year");
        } else {
            // Leap year: divisible by 4 AND (not divisible by 100 OR divisible by 400)
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            // Print the result
            if (isLeapYear) {
                System.out.println("The year " + year + " is a Leap Year");
            } else {
                System.out.println("The year " + year + " is not a Leap Year");
            }
        }

        // Close Scanner
        input.close();
    }
}
