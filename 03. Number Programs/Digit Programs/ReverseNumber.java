/*
 * Examples:
 * 
 * Input:
 * n = 123
 * Output:
 * 321
 * 
 * Input: 
 * n = 4681
 * Output:
 * 1864
 */

import java.util.Scanner;

public class ReverseNumber {

    // Method to reverse a number
    public static int reverseNumber(int n) {

        int reverse = 0;

        while (n > 0) {
            int rem = n % 10;
            reverse = (reverse * 10) + rem;
            n /= 10;
        }

        return reverse;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Reverse number of " + n + " is: " + reverseNumber(n));

        sc.close();
    }
}
