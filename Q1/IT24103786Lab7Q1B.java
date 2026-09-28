import java.util.Scanner;

public class IT24103786Lab7Q1B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int s = 1; s <= 3; s++) {
            System.out.println("Student " + s);
            System.out.print("Enter marks: ");

            double m1 = sc.nextDouble();
            double m2 = sc.nextDouble();
            double m3 = sc.nextDouble();
            double m4 = sc.nextDouble();

            double average = (m1 + m2 + m3 + m4) / 4;
            String grade;

            if (average >= 75) {
                grade = "Distinction";
            } else if (average >= 50) {
                grade = "Credit";
            } else {
                grade = "Fail";
            }

            System.out.println("Average is : " + average);
            System.out.println("Overall Grade is : " + grade);
            System.out.println();
        }

        sc.close();
    }
}