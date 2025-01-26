package Test;

import java.util.Scanner;

public class _40_PrintEven1ToN {

    // Method to print even number from 1 to n
    public static void printEven(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printEven(n);

        sc.close();
    }
}
