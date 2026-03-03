package week3And4.level1;

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Get countdown start value from user
        System.out.print("Enter countdown start value: ");
        int counter = input.nextInt();

        // Use while loop to countdown from user input to 1
        System.out.println("Rocket Launch Countdown:");
        while (counter >= 1) {
            System.out.println(counter);
            counter--;
        }
        System.out.println("Liftoff!");

        // Close Scanner
        input.close();
    }
}
