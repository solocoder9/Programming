import java.util.Scanner;

public class Palindrome {

	// Method to check whether the string is palindrome or not
	// Time Complexity: O(n)
	// Space Complexity: O(n)
	public static boolean isPalindrome(String str) {

		String reverseString = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			reverseString += str.charAt(i);
		}

		return str.equals(reverseString);
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
