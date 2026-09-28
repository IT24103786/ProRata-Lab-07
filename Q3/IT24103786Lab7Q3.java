import java.util.Scanner;

public class IT24103786Lab7Q3 {
    public static void main(String[] args) {
        final double DISCOUNT_RATE = 0.05;
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.println("Customer " + i);
            System.out.print("Enter total bill amount: ");
            double bill = sc.nextDouble();

            System.out.print("Enter mode of payment (C for cash, O for other): ");
            char mode = sc.next().charAt(0);

            if (mode == 'C' || mode == 'c') {
                double discount = bill * DISCOUNT_RATE;
                System.out.println("Discount is : " + discount);
                System.out.println("Amount to be paid: " + (bill - discount));
            } else if (mode == 'O' || mode == 'o') {
                System.out.println("No discount applicable");
                System.out.println("Amount to be paid: " + bill);
            } else {
                System.out.println("Payment Mode is Not Valid");
            }
            System.out.println();
        }

        sc.close();
    }
}