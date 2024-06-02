// Java program to check whether the number is tech number or not

import java.util.Scanner;

public class _06_TechNumber {

    // Method to check whether the number is a Tech number or not
    public static boolean isTechNumber(int n) {

        // Count the digits in the number
        int temp = n;
        int digitCount = 0;

        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        // A Tech number must have an even number of digits
        if (digitCount % 2 != 0) {
            return false;
        }

        int halfDigitCount = digitCount / 2;
        int divisor = (int) Math.pow(10, halfDigitCount);
        int sumOfHalves = (n / divisor) + (divisor);

        return (sumOfHalves * sumOfHalves) == n;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isTechNumber(n)) {
            System.out.println(n + " is a Tech number");
        } else {
            System.out.println(n + " is not a Tech number");
        }

        sc.close();
    }
}
