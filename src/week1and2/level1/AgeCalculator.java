package week1and2.level1;

public class AgeCalculator {
    public static void main(String[] args) {
        String name = "Harry";
        int birthYear = 2000;
        int currentYear = 2024;

        int age = currentYear - birthYear;

        System.out.println(name + "'s age in " + currentYear + " is " + age);
    }
}
