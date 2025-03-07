/*
 * A Smith number is a composite number whose sum of digits equals to
 * the sum of digits of its prime factors, excluding 1
 */

import java.util.Scanner;

public class _13_SmithNumber {

    // Method to calculate sum of digits of a number
    public static int sumDigits(int n) {

        int sumOfDigits = 0;

        while (n > 0) {
            int rem = n % 10;
            sumOfDigits += rem;
            n /= 10;
        }

        return sumOfDigits;
    }

    // Method to calculate the sum of digits of all prime factors of a number
    public static int sumPrimeFactorsDigits(int n) {

        int sumPrimeFactorsDigits = 0;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                sumPrimeFactorsDigits += sumDigits(i);
                n /= i;
            }
        }

        if (n != 1) {
            sumPrimeFactorsDigits += sumDigits(n);
        }

        return sumPrimeFactorsDigits;
    }

    // Method to check if the number is Smith number or not
    public static boolean isSmith(int n) {

        return sumDigits(n) == sumPrimeFactorsDigits(n);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (isSmith(n)) {
            System.out.println("Smith number");
        } else {
            System.out.println("Not Smith number");
        }

        sc.close();
    }
}
