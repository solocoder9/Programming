// Wajp to find power of n

import java.util.Scanner;

public class _02_PowerOfN {

    // Method to find the power of a number
    public static int findPower(int n, int expo) {

        if (expo == 0) {
            return 1;
        }

        int powerOfNumber = 1;

        for (int i = 1; i <= expo; i++) {
            powerOfNumber = powerOfNumber * n;
        }

        return powerOfNumber;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base number: ");
        int n = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int expo = sc.nextInt();

        System.out.print("Result: " + findPower(n, expo));

        sc.close();
    }

}
