// Wajp print factorial of a number

import java.util.Scanner;

public class _01_FactorialOfaNumber {
    
    // Method to print factorial of a number
    static void printFactorial(int n) {

        int factorial = 1;

        if(n < 0) {
            {
                System.out.print("Invalid input");
            }
            return;
        }

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        System.out.print("Factorial of " + n + " is: " + factorial);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printFactorial(n);

        sc.close();
    }
}
