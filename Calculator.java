import java.util.Scanner;

public class Calculator {

    // Addition Method
    public static double add(double a, double b) {
        return a + b;
    }

    // Subtraction Method
    public static double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication Method
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Division Method
    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        do {
            System.out.println("\n===== JAVA CONSOLE CALCULATOR =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choose an operation (1-4): ");

            int option = sc.nextInt();

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;

            switch (option) {
                case 1:
                    result = add(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 2:
                    result = subtract(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 3:
                    result = multiply(num1, num2);
                    System.out.println("Result = " + result);
                    break;

                case 4:
                    result = divide(num1, num2);
                    if (num2 != 0)
                        System.out.println("Result = " + result);
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

            System.out.print("\nDo you want to perform another calculation? (Y/N): ");
            choice = sc.next().charAt(0);

        } while (choice == 'Y' || choice == 'y');

        System.out.println("Thank you for using the calculator!");
        sc.close();
    }
}