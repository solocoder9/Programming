// Java program to check whether the number is Palindrome of not

import java.util.Scanner;

public class _03_PalindromeNumber {

	// Method to check whether the number is Palindrome or not
	public static boolean checkPalindrome(int n) {

		int temp = n;
		int reverseNumber = 0;

		while (temp > 0) {
			int lastDigit = temp % 10;
			reverseNumber = (reverseNumber * 10) + lastDigit;
			temp /= 10;
		}

		return n == reverseNumber;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = sc.nextInt();

		if (checkPalindrome(n)) {
			System.out.println(n + " is a palindrome number");
		} else {
			System.out.println(n + " is not a palindrome number");
		}

		sc.close();
	}
}
