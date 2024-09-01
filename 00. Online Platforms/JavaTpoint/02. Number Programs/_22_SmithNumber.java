// Java program to check whether the number is a Smith number or not

import java.util.Scanner;

public class _22_SmithNumber {

    // Method to find the sum of digits of a number
    public static int sumDigits(int n) {
        int sumOfDgts = 0;
        while (n > 0) {
            sumOfDgts += (n % 10);
            n /= 10;
        }

        return sumOfDgts;
    }

    // Method to check whether the number is a Smith number or not
    public static boolean isSmith(int n) {

        if (n <= 1) {
            return false;
        }

        int temp = n;
        int sumOfPrimeFactorsDgts = 0;

        for (int i = 2; i * i <= temp; i++) {
            while (temp % i == 0) {
                sumOfPrimeFactorsDgts += sumDigits(i);
                temp /= i;
            }
        }

        if (temp > 1) {
            sumOfPrimeFactorsDgts += sumDigits(temp);
        }

        return sumOfPrimeFactorsDgts == sumDigits(n);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        // Display whether the number is a Smith number or not
        if (isSmith(n)) {
            System.out.println(n + " is a Smith number");
        } else {
            System.out.println(n + " is not a Smith number");
        }

        sc.close();
    }
}
