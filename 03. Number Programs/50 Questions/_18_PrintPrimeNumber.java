// Wajp to print prime numbers within given range

import java.util.Scanner;

public class _18_PrintPrimeNumber {

    // Method to check if the number is prime or not
    public static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to print prime numbers within given range
    public static void printPrime(int n) {

        for (int i = 2; i <= n; i++) {
            if (checkPrime(i)) {
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
