// Wajp to print even number within the range

import java.util.Scanner;

public class _15_PrintEvenNumber {

    // Method to print even numbers with in the range
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

        System.out.print("Enter the range: ");
        int n = sc.nextInt();

        printEven(n);

        sc.close();
    }
}
