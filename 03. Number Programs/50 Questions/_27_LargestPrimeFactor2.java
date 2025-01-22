package Test;

import java.util.Scanner;

public class _27_LargestPrimeFactor2 {

    // Method to find the largest prime factor of a number
    public static int largestPrimeFactor(int n) {
        int largestPrimeFact = 0;

        // Divide by 2 until n is odd
        while (n % 2 == 0) {
            largestPrimeFact = 2;
            n /= 2;
        }

        // Check for odd factors starting from 3
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largestPrimeFact = i;
                n /= i;
            }
        }

        // If n is still greater than 2, then it is prime
        if (n > 2) {
            largestPrimeFact = n;
        }

        return largestPrimeFact;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println("Largest prime factor of " + N + " is: " + largestPrimeFactor(N));

        sc.close();
    }
}
