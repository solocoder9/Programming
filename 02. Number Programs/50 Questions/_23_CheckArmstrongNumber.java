/* 
 * For a given 3 digit number, find whether it is armstrong number or not.
 * An Armstrong number of three digits is an integer such that the sum of 
 * the cubes of its digits is equal to the number itself. Return "Yes" if 
 * it is a armstrong number else return "No".
 * NOTE: 371 is an Armstrong number since 3^3 + 7^3 + 1^3 = 371.
 */

import java.util.Scanner;

public class _23_CheckArmstrongNumber {

    // Method to check if the number is armstrong or not
    public static boolean checkArmstrong(int n) {

        int temp = n;
        int countDigits = 0;

        while (temp > 0) {
            temp /= 10;
            countDigits++;
        }

        temp = n; // reset the temp value
        int sumDigitPower = 0;

        while (temp > 0) {
            int rem = temp % 10;
            int digitPower = 1;
            for (int i = 1; i <= countDigits; i++) {
                digitPower = digitPower * rem;
            }
            sumDigitPower += digitPower;
            temp /= 10;
        }

        return n == sumDigitPower;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (checkArmstrong(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        sc.close();
    }
}
