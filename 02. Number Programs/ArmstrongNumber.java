// Program to check the number is Armstrong or not
// Example - 1, 2, 3 
// 153 = 1^3 + 5^3 + 3^3 = 3 + 125 + 27 = 153
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643

import java.util.Scanner;

public class ArmstrongNumber {

    // Method to check whether the number is armstrong or not
    public static boolean checkArmstrong(int n) {
        int temp = n;
        int countDigit = 0;

        while (temp > 0) {
            countDigit++;
            temp /= 10;
        }

        temp = n; // Reset the temp variable
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            int remPower = 1;

            for (int i = 0; i < countDigit; i++) {
                remPower *= rem;
            }
            sum += remPower;
            temp /= 10;
        }

        return n == sum;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (checkArmstrong(n)) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }

        sc.close();
    }
}
