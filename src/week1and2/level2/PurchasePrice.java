package week1and2.level2;
import java.util.Scanner;

public class PurchasePrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the unit price of the item (INR): ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR " + totalPrice
                + " if the quantity " + quantity + " and unit price is INR " + unitPrice);

        input.close();
    }
}
