package Practice;

import java.util.Scanner;

public class Palindrome2 {

    // Method to check whether the string is palindrome or not
    // Time Complexity: O(n) 
    // Space Complexity: O(n)
    public static boolean isPalindrome(String str) {
        // Reverse the string and compare it with the original string
        return new StringBuilder(str).reverse().toString().equals(str);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string to check if it is a palindrome: ");
        String str = sc.nextLine();

        // Display whether the string is palindrome or not
        System.out.println(isPalindrome(str));

        sc.close();
    }
}
