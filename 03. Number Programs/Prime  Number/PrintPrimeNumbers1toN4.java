// Java program to print Prime numbers with in a given range
// Using Sieve of Eratosthenes
// Efficient approach

import java.util.Scanner;

public class PrintPrimeNumbers1toN4 {

    // Method to print prime numbers within a range
    // Time Complexity: O(n log log n)
    // Space Complexity: O(n)
    public static void printPrime(int n) {

        boolean[] primeArr = new boolean[n + 1];

        for (int i = 2; i * i <= n; i++) {
            if (primeArr[i] == false) {
                for (int j = i * i; j <= n; j += i) {
                    primeArr[j] = true;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (primeArr[i] == false) {
                System.out.print(i + " ");
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printPrime(n);

        sc.close();
    }
}
