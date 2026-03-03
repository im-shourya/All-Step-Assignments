package week1and2.level1;

public class AverageMarksCalculator {
    public static void main(String[] args) {
        String name = "Sam";
        int mathMarks = 94;
        int physicsMarks = 95;
        int chemistryMarks = 96;
        int totalSubjects = 3;

        double averageMarks = (double) (mathMarks + physicsMarks + chemistryMarks) / totalSubjects;

        System.out.println(name + "'s average mark in PCM is " + averageMarks);
    }
}
