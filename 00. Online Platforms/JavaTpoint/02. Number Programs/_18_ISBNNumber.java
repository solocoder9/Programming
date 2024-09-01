// Java program to check whether the number is ISBN Number or not

import java.util.Scanner;

public class _18_ISBNNumber {

    // Method to check if the number is a valid ISBN number
    public static boolean isISBN(String s) {
        // Check if the length is exactly 10 digits
        if (s.length() != 10) {
            return false;
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            char ch = s.charAt(i);
            // Ensure that all characters are digits
            if (!Character.isDigit(ch)) {
                return false;
            }
            // Convert character to integer and calculate the weighted sum
            int digit = ch - '0'; // Convert char to int
            sum += (digit * (10 - i));
        }

        // Check if the sum is divisible by 11
        return (sum % 11) == 0;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        String s = sc.nextLine();

        // Display whether the number is an ISBN number or not
        if (isISBN(s)) {
            System.out.println(s + " is an ISBN number");
        } else {
            System.out.println(s + " is not an ISBN number");
        }

        sc.close();
    }
}
