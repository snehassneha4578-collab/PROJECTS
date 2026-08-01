import java.util.Scanner;

public class ScientificCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== SCIENTIFIC CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("6. Square");
        System.out.println("7. Square Root");
        System.out.println("8. Power");
        System.out.println("9. Factorial");
        System.out.println("10. Sine");
        System.out.println("11. Cosine");
        System.out.println("12. Tangent");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.println("Answer = " + (a + b));

        } else if (choice == 2) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.println("Answer = " + (a - b));

        } else if (choice == 3) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();
            System.out.println("Answer = " + (a * b));

        } else if (choice == 4) {

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();
            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            if (b != 0)
                System.out.println("Answer = " + (a / b));
            else
                System.out.println("Division by zero is not allowed.");

        } else if (choice == 5) {

            System.out.println("Thank you!");

        } else if (choice == 6) {

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            System.out.println("Answer = " + (num * num));

        } else if (choice == 7) {

            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num >= 0)
                System.out.println("Answer = " + Math.sqrt(num));
            else
                System.out.println("Invalid Input");

        } else if (choice == 8) {

            System.out.print("Enter base: ");
            double base = sc.nextDouble();

            System.out.print("Enter exponent: ");
            double exp = sc.nextDouble();

            System.out.println("Answer = " + Math.pow(base, exp));

        } else if (choice == 9) {

            System.out.print("Enter a number: ");
            int n = sc.nextInt();

            long fact = 1;

            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }

            System.out.println("Factorial = " + fact);

        } else if (choice == 10) {

            System.out.print("Enter angle in degrees: ");
            double angle = sc.nextDouble();

            System.out.println("Answer = " +
                    Math.sin(Math.toRadians(angle)));

        } else if (choice == 11) {

            System.out.print("Enter angle in degrees: ");
            double angle = sc.nextDouble();

            System.out.println("Answer = " +
                    Math.cos(Math.toRadians(angle)));

        } else if (choice == 12) {

            System.out.print("Enter angle in degrees: ");
            double angle = sc.nextDouble();

            System.out.println("Answer = " +
                    Math.tan(Math.toRadians(angle)));

        } else {

            System.out.println("Invalid Choice");

        }

        sc.close();
    }
}