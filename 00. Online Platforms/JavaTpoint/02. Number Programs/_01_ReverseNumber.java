// Java program to reverse a number

import java.util.Scanner;

public class _01_ReverseNumber {

    // Method to reverse a number
    public static int reverseNumber(int n) {

        int revNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n /= 10;
        }

        return revNum;
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
