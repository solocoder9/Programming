// Wajp to check odd or even without '%' operator

import java.util.Scanner;

public class _04_CheckEvenOdd {

    // Method to check if the number is even or odd
    public static boolean checkEvenOdd(int n) {
        return (n & 1) == 0;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (checkEvenOdd(n)) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        sc.close();
    }
}
