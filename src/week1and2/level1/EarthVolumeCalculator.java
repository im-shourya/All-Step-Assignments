package week1and2.level1;

public class EarthVolumeCalculator {
    public static void main(String[] args) {
        double pi = 3.14159265358979;
        double radiusKm = 6378;
        double kmPerMile = 1.6;

        double volumeKm3 = (4.0 / 3.0) * pi * radiusKm * radiusKm * radiusKm;

        double radiusMiles = radiusKm / kmPerMile;
        double volumeMiles3 = (4.0 / 3.0) * pi * radiusMiles * radiusMiles * radiusMiles;

        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 +
                " and cubic miles is " + volumeMiles3);
    }
}
