// Java program to check whether the number is Odious number or not

import java.util.Scanner;

public class _11_OdiousNumber {

    // Method to check whether the number is an Odious number or not
    public static boolean isOdious(int decimalNumber) {

        String binary = "";

        while (decimalNumber > 0) {
            binary = (decimalNumber % 2) + binary;
            decimalNumber /= 2;
        }

        int count = 0;

        // Count the number of '1's in the binary
        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1') {
                count++;
            }
        }

        return count % 2 != 0;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        // Display whether the number is an Odious number or not
        if (isOdious(n)) {
            System.out.println(n + " is an Odious number");
        } else {
            System.out.println(n + " is not an Odious number");
        }

        sc.close();
    }
}
