// Wajp to count even and odd digits in a given number excluding zero.

import java.util.Scanner;

public class _14_CountEvenOddDigits {

    // Method to count even and odd digits of a number
    static void countDigits(int n) {

        int evenDigits = 0;
        int oddDigits = 0;

        while (n > 0) {
            int rem = n % 10;
            if (rem != 0) {
                if (rem % 2 == 0) {
                    evenDigits++;
                }
                else {
                    oddDigits++;
                }
            }
            n /= 10;
        }

        System.out.println(evenDigits + " even digits");
        System.out.println(oddDigits + " odd digits");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        countDigits(n);

        sc.close();
    }
}
