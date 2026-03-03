package week1and2.level2;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter integer a: ");
        int a = input.nextInt();

        System.out.print("Enter integer b: ");
        int b = input.nextInt();

        System.out.print("Enter integer c: ");
        int c = input.nextInt();

        int operation1 = a + b * c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;

        System.out.println("The results of Int Operations are " + operation1 + ", "
                + operation2 + ", " + operation3 + ", and " + operation4);

        input.close();
    }
}
