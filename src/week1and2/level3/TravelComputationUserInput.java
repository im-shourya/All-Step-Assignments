package week1and2.level3;

import java.util.Scanner;

public class TravelComputationUserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the traveler's name: ");
        String name = input.nextLine();

        System.out.print("Enter Starting City: ");
        String fromCity = input.nextLine();
        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();
        System.out.print("Enter Destination City: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " (miles): ");
        double distanceFromToVia = input.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " (miles): ");
        double distanceViaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken from " + fromCity + " to " + viaCity + " (minutes): ");
        int timeFromToVia = input.nextInt();
        System.out.print("Enter time taken from " + viaCity + " to " + toCity + " (minutes): ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistance + " miles and the Total Time taken is " +
                totalTime + " minutes");
        input.close();
    }
}
