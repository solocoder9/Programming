package Test;

import java.util.Scanner;

public class _39_PrintAGivenSeries {

    // Method to print a given series
    // Input: n = 6
    // Output: 1 2 4 8 16 32
    public static void printSeries(int n) {

        for (int i = 0; i < n; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printSeries(n);

        sc.close();
    }
}
