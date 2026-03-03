package week3And4.level1;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get countdown start value from user
        System.out.print("Enter countdown start value: ");
        int startValue = input.nextInt();

        // Use for loop to countdown from user input to 1
        System.out.println("Rocket Launch Countdown:");
        for (int counter = startValue; counter >= 1; counter--) {
            System.out.println(counter);
        }
        System.out.println("Liftoff!");

        // Close Scanner
        input.close();
    }
}
