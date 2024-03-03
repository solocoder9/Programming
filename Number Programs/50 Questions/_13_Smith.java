/*
 * A Smith number is a composite number whose sum of digits equals to
 * the sum of digits of its prime factors, excluding 1
 */

import java.util.Scanner;

public class _13_Smith {
    
    // Method to calculate sum of digits of a number
    static int sumDigits(int n) {

        int sumOfDigits = 0;

        while (n > 1) {
            int rem = n % 10;
            sumOfDigits += rem;
            n /= 10;
        }

        return sumOfDigits;
    }

    // Method to check if the numbe is a prime or not
    static boolean chckPrime(int n) {

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

    // Method to check if the numbe is Smith number or not 
    static boolean checkSmith(int n) {

        if (n <= 1) {
            return false;
        }

        int sumPrimeFactors = 0;

        for (int i = 2; i <= n/2; i++) {
            if(chckPrime(i) && i % n == 0) {
                sumPrimeFactors += i;
            }
        }

        return sumDigits(n) == sumPrimeFactors;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (checkSmith(n)) {
            System.out.println("Smith number");
        }
        else {
            System.out.println("Not Smith number");
        }

        sc.close();
    }
}
