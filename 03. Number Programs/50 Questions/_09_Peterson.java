/*
 * A number is said to be Perterson if the sum of factorials
 * of each digit is equal to the sum of the number itself.
 * 
 * Example -
 * 145  = !1 + !4 + !5
 *      = 1 + 4*3*2*1 + 5*4*3*2*1
 *      = 1 + 24 + 120
 *      = 145
 *      
 */

import java.util.Scanner;

public class _09_Peterson {

    // Method to calculate the factorial of a number
    public static int calFactorial(int n) {

        if (n < 0) {
            return 0;
        }
        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Method to check sum of factorials of all digit is equal to number itself
    public static boolean checkPeter(int n) {

        int temp = n;
        int sumFactorial = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sumFactorial += calFactorial(rem);
            temp /= 10;
        }

        return n == sumFactorial;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (checkPeter(n)) {
            System.out.println("Peter");
        } else {
            System.out.println("Not Peter");
        }

        sc.close();
    }
}
