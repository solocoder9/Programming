// Java program to check whether the number is Neon number or not

import java.util.Scanner;

public class _09_NeonNumber {

    // Method to check whether the number is Neon number or not
    public static boolean isNeon(int n) {

        if (n < 0) {
            return false;
        }

        int squre = n * n;
        int sumOfDgt = 0;

        while (squre > 0) {
            sumOfDgt += (squre % 10);
            squre /= 10;
        }

        return sumOfDgt == n;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isNeon(n)) {
            System.out.println(n + " is a Neon number");
        } else {
            System.out.println(n + " is not a Neon number");
        }

        sc.close();
    }
}
