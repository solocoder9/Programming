package Test;

import java.util.Scanner;

public class _27_LargestPrimeFactor {

    // Method to find the largest prime factor of a number
    public static int largestPrimeFactor(int n) {
        int largestPrimeFact = 0;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (i > largestPrimeFact) {
                    largestPrimeFact = i;
                }
                n /= i;
            }
        }
        if (n != 1) {
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
