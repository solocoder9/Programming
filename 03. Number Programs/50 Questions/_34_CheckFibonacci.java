package Test;

import java.util.Scanner;

public class _34_CheckFibonacci {

    // Method to check whether the number is a fibonacci number or not
    public static boolean isFibonacci(int n) {
        int a = 0, b = 1;

        while (b <= n) {
            if (b == n) {
                return true;
            }
            int c = a + b;
            a = b;
            b = c;
        }

        return false;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();

        System.out.println(isFibonacci(n));

        sc.close();
    }
}
