package week1and2.level2;
import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        int quotient = number1 / number2;
        int remainder = number1 % number2;

        System.out.println("The Quotient is " + quotient + " and Reminder is "
                + remainder + " of two number " + number1 + " and " + number2);

        input.close();
    }
}
