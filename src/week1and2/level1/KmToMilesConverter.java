package week1and2.level1;
import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmPerMile = 1.6;

        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        double miles = km / kmPerMile;

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        input.close();
    }
}
