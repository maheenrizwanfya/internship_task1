import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.println("Enter the number of students: ");
        int numberOfStudents = input.nextInt();
        input.nextLine(); // to skip the enter line

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter name of Student " + (i+1) + " :");
            String name = input.nextLine();
            System.out.println("Enter grades of " + name + " :");
            Double grade = input.nextDouble();
            input.nextLine();
            students.add(new Student(name,grade));
        }

        System.out.println("The class average is: " + calculateAverage(students));
        Student highest = findHighest(students);
        System.out.println("The highest grade is: " + highest.getGrade() + " by " + highest.getName());
        Student lowest = findLowest(students);
        System.out.println("The lowest grade is: " + lowest.getGrade() + " by " + lowest.getName());
    }

    static double calculateAverage(ArrayList<Student> students){
        double sum = 0;
        for (Student student : students){
            sum = sum + student.getGrade();
        }
        double average = sum / students.size();
        return average;
    }

    static Student findHighest(ArrayList<Student> students){
       Student highest = students.get(0); // highest student for now is the first student in the list
       for(Student student : students){
           if (student.getGrade() > highest.getGrade())
               highest = student;
       }
        return highest;
    }

    static Student findLowest(ArrayList<Student> students){
        Student lowest = students.get(0); // lowest student for now is the first student in the list
        for(Student student : students){
            if (student.getGrade() < lowest.getGrade())
                lowest = student;
        }
        return lowest;
    }
}
