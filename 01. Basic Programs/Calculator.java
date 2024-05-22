// Java calculator program

import java.util.Scanner;

public class Calculator {

    // Method to perform arithmetic operations on two numbers
    public static void performCalculation(int a, int b, char operator) {
        switch (operator) {
            case '+':
                System.out.println("Sum of a and b: " + (a + b));
                break;
            case '-':
                System.out.println("Subtraction of a and b: " + (a - b));
                break;
            case '*':
                System.out.println("Multiplication of a and b: " + (a * b));
                break;
            case '/':
                if (b != 0) {
                    System.out.println("Division of a and b: " + (a / b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println("Modulus of a and b: " + (a % b));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please use one of +, -, *, /, %.");
                break;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the operator: ");
        char operator = sc.next().charAt(0);

        performCalculation(a, b, operator);

        sc.close();
    }
}
