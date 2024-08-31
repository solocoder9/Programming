/* Wajp go chrck given number is prime or not
 And achive ((sqrt(n)) time complexity */

import java.util.Scanner;

public class _22_CheckPrimeNumber {

    // Method to check if the number is prime or not
    public static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i++) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (checkPrime(n)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }

        sc.close();
    }
}
