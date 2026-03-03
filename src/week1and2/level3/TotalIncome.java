package week1and2.level3;

import java.util.Scanner;

public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Salary (INR): ");
        double salary = input.nextDouble();

        System.out.print("Enter Bonus (INR): ");
        double bonus = input.nextDouble();

        double income = salary + bonus;

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus +
                ". Hence Total Income is INR " + income);
        input.close();
    }
}
