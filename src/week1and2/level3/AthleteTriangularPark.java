package week1and2.level3;

import java.util.Scanner;

public class AthleteTriangularPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 of the triangle (meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter side 2 of the triangle (meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter side 3 of the triangle (meters): ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;
        double distanceToRunMeters = 5000;

        double rounds = distanceToRunMeters / perimeter;

        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        input.close();
    }
}
