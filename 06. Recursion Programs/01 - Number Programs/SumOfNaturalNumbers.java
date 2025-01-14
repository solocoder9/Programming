package Recursion;

import java.util.Scanner;

public class SumOfNaturalNumbers {

    // Recursive method to calculate sum of n natural numbers
    public static int sumOfNumbers(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return n + sumOfNumbers(n - 1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(sumOfNumbers(n));
        sc.close();
    }
}
