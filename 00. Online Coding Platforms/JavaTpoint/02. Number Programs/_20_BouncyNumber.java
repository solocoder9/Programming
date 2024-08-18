// Java program to check whether the number is a Bouncy number or not

import java.util.Scanner;

public class _20_BouncyNumber {

    // Method to check whether the number is a Bouncy number or not
    public static boolean isBouncy(int n) {
        // Edge case for single-digit numbers
        if (n < 10) {
            return false; // Single-digit numbers are not bouncy
        }

        boolean increasing = false;
        boolean decreasing = false;

        int prevDigit = n % 10;
        n /= 10;

        while (n > 0) {
            int currentDigit = n % 10;

            if (currentDigit < prevDigit) {
                increasing = true; // Found a decreasing sequence
            } else if (currentDigit > prevDigit) {
                decreasing = true; // Found an increasing sequence
            }

            prevDigit = currentDigit;
            n /= 10;
        }

        // A number is bouncy if it is neither increasing nor decreasing
        return increasing && decreasing;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        // Display whether the number is a Bouncy number or not
        if (isBouncy(n)) {
            System.out.println(n + " is a Bouncy number");
        } else {
            System.out.println(n + " is not a Bouncy number");
        }

        sc.close();
    }
}
