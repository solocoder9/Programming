package Recursion;

import java.util.Scanner;

public class SumOfDigits {

    // Recursive method to find the sum of the digits of a number
    public static int sumOfDigits(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case:
        return (n % 10) + sumOfDigits(n / 10);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Handle the special case where the number is 0
        if (n == 0) {
            System.out.println("The sum of digits is: 0");
        } else {
            System.out.println("The sum of digits is: " + sumOfDigits(n));
        }

        sc.close();
    }
}
