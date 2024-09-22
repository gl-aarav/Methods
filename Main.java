import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStudents;
        System.out.print("Enter the number of students: ");
        numberOfStudents = in.nextInt();

        int[] grades = new int[numberOfStudents];
        int sum = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the grade for student " + (i+1) + ": ");
            grades[i] = in.nextInt();
            sum += grades[i];
        }

        double average = (double) sum / numberOfStudents;
        int minimum = grades[0];
        int maximum = grades[0];

        for (int i = 1; i < numberOfStudents; i++) {
            if (grades[i] < minimum){
                minimum = grades[i];
            }
            if (grades[i] > maximum) {
                maximum = grades[i];
            }
        }

        System.out.println("The average is: " + average);
        System.out.println("The minimum is: " + minimum);
        System.out.println("The maximum is: " + maximum);
    }
}
