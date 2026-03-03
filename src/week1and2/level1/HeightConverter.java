package week1and2.level1;
import java.util.Scanner;

public class HeightConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cmPerInch = 2.54;
        int inchesPerFoot = 12;

        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        double totalInches = heightCm / cmPerInch;
        int feet = (int) (totalInches / inchesPerFoot);
        double inches = totalInches % inchesPerFoot;

        System.out.println("Your Height in cm is " + heightCm + " while in feet is " + feet +
                " and inches is " + inches);
        input.close();
    }
}
