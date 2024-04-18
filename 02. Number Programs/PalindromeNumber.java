// Program to check the number is Palindrome or not
// Example - 121, 5445, 404

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        int temp = number;
        int lastDigit = 0;
        int reverseNumber = 0;

        // Reversing the number
        while(temp > 0) {
            lastDigit = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            temp = temp / 10;
        }

        if(reverseNumber == number) {
            System.out.println(number + " is a Palindrome number");
        }
        else {
            System.out.println(number + " is not a Palindrome number");
        }

        sc.close();
    }    
}
