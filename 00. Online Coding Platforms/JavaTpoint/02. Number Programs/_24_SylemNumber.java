// Java program to check whether the number is a Xylem number or Phloem number

import java.util.Scanner;

public class _24_SylemNumber {

    // Method to check whether the number is a Xylem number or not
    public static boolean isXylem(int n) {

        int temp = n;
        int sumOfExtremeDgts = 0;
        int sumOfMeanDgts = 0;

        while (temp > 0) {
            if (temp == n || temp < 10) {
                sumOfExtremeDgts += (temp % 10);
            } else {
                sumOfMeanDgts += (temp % 10);
            }

            temp /= 10;
        }

        return sumOfExtremeDgts == sumOfMeanDgts;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        // Display whether the number is a Xylem number or Phloem number
        if (isXylem(n)) {
            System.out.println(n + " is a Xylem number");
        } else {
            System.out.println(n + " is a Phloem number");
        }

        sc.close();
    }
}
