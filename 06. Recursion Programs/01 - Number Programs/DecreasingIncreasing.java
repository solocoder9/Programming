package Recursion;

import java.util.Scanner;

public class DecreasingIncreasing {

    // Recursive method to print numbers in both decreasing and increasing order
    public static void decreasingIncreasing(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Print current number (Decreasing part)
        System.out.println(n);

        // Recursive case: to print in decreasing order
        decreasingIncreasing(n - 1);

        // Print current number (Increasing part)
        System.out.println(n);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        decreasingIncreasing(n);

        sc.close();
    }
}
