// Java program to check whether the number is a Strong number or not

import java.util.Scanner;

public class _19_StrongNumber {

    // Method to calculate the factor of a number
    public static int findFactor(int n) {

        if (n == 0) {
            return 1; // 0! = 1
        }

        int factor = 1;

        for (int i = 1; i <= n; i++) {
            factor *= i;
        }

        return factor;
    }

    // Method to check whether the number is a Strong number or not
    public static boolean isStrong(int n) {

        int temp = n;
        int sum = 0;

        while (temp > 0) {
            sum += (findFactor(temp % 10));
            temp /= 10;
        }

        return n == sum;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        // Display whether the number is a Strong number or not
        if (isStrong(n)) {
            System.out.println(n + " is a Strong number");
        } else {
            System.out.println(n + " is not a Strong number");
        }

        sc.close();
    }
}
