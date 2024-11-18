import java.util.Scanner;

public class Palindrome3 {

	// Method to check whether the string is palindrome or not
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static boolean isPalindrome(String str) {

		int low = 0; // Start index
		int high = str.length() - 1; // End index

		while (low < high) {
			if (str.charAt(low) != str.charAt(high)) {
				return false;
			}
			low++;
			high--;
		}

		return true; 
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
