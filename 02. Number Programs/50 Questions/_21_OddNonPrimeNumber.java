// Wajp to print n odd non prime number
// input: 4
// Output: 25

import java.util.Scanner;

public class _21_OddNonPrimeNumber {
    
    // Method to check if the number is prime or not
    public static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if(n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to print n odd not prime number
    public static void printOddNonPrime(int n) {

        int count = 0;
        int number = 9;

        while (count < n) {
            if (!checkPrime(number)) {
                count++;
                if (count == n) {
                    System.out.println(number);
                }
            }
            number += 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printOddNonPrime(n);

        sc.close();
    }
}

