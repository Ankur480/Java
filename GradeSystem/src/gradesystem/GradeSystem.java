package gradesystem;
import java.util.Scanner;

public class GradeSystem {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            double marks = sc.nextDouble();
            sum += marks;
        }

        double avg = sum / n;

        System.out.println("Average Marks = " + avg);

        if (avg >= 90) {
            System.out.println("Grade: A+");
        } else if (avg >= 80) {
            System.out.println("Grade: A");
        } else if (avg >= 70) {
            System.out.println("Grade: B");
        } else if (avg >= 60) {
            System.out.println("Grade: C");
        } else if (avg >= 50) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
    
}