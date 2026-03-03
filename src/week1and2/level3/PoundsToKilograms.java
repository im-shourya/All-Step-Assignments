package week1and2.level3;

import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the weight in pounds: ");
        double weightInPounds = input.nextDouble();

        double weightInKg = weightInPounds / 2.2;

        System.out.println("The weight of the person in pounds is " + weightInPounds + " and in kg is " + weightInKg);
        input.close();
    }
}
