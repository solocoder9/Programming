/*
 * Examples:- 121, 5445, 36763, 22
 */

import java.util.Scanner;

public class PalindromeNumber {
    
    // Method to chek the number is palindrome or not
    static boolean checkPalindrome(int number) {

        if(number < 0) {
            return false;
        }

        int temp = number;
        int reverseNumber = 0;

        while (temp > 0) {
            int rem = temp % 10;
            reverseNumber = (reverseNumber * 10) + rem;
            temp /= 10;
        }

        return number == reverseNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        if(checkPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        }
        else {
            System.out.println(number + " is not a palindrome number");
        }

        sc.close();
    }
}
