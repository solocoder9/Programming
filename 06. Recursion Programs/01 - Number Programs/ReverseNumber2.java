package Recursion;

import java.util.Scanner;

public class ReverseNumber2 {

    // Recursive method to reverse a number
    public static int reverseNumber(int n, int reversed) {

        // Base case: If the number is 0, return the reversed number
        if (n == 0) {
            return reversed;
        }

        // Recursive case: Get the last digit and move it to the correct position
        return reverseNumber(n / 10, reversed * 10 + (n % 10));
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Call the reverseNumber function starting with the number and an initial reversed value of 0
        System.out.println("The reversed number is: " + reverseNumber(n, 0));

        sc.close();
    }
}
