import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        System.out.println("Enter student's grades: ");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Student" + (i+1) + ": ");
            double grade = input.nextDouble();
            grades.add(grade);
        }

        System.out.println("The class average is: " + calculateAverage(grades));
        System.out.println("The highest grade is: " + findHighest(grades));
        System.out.println("The lowest grade is: " + findLowest(grades));

    }

    static double calculateAverage(ArrayList<Double> grades){
        double sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum = sum + grades.get(i);
        }
        double average = sum / grades.size();
        return average;
    }

    static double findHighest(ArrayList<Double> grades){
        double max = 0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) > max)
                max = grades.get(i);
        }
        return max;
    }

    static double findLowest(ArrayList<Double> grades){
        double min = 100; // since the marks will be out of 100 max
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < min)
                min = grades.get(i);
        }
        return min;
    }
}