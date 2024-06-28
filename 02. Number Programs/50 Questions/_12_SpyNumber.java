/*
 * A positive integer is called a Spy number if the sum and product
 * of its digits are equal.
 */

import java.util.Scanner;

public class _12_SpyNumber {

    // Method to check if the number is spy or not
    public static boolean checkSpy(int n) {

        if (n < 0) {
            return false;
        }

        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (n > 0) {
            int rem = n % 10;
            sumOfDigits += rem;
            productOfDigits *= rem;
            n /= 10;
        }

        return sumOfDigits == productOfDigits;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (checkSpy(n)) {
            System.out.println("Spy number");
        } else {
            System.out.println("Not a spy number");
        }

        sc.close();
    }
}
