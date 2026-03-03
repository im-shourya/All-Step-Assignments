package week1and2.level1;

public class KmToMilesFixed {
    public static void main(String[] args) {
        double distanceKm = 10.8;
        double kmPerMile = 1.6;

        double distanceMiles = distanceKm / kmPerMile;

        System.out.println("The distance " + distanceKm + " km in miles is " + distanceMiles);
    }
}
