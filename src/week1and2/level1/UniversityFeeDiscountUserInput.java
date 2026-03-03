package week1and2.level1;

import java.util.Scanner;

public class UniversityFeeDiscountUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the course fee (INR): ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        double discount = fee * (discountPercent / 100);
        double discountedFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + discountedFee);
        input.close();
    }
}
