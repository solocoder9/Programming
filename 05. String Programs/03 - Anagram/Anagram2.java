import java.util.Arrays;
import java.util.Scanner;

public class Anagram2 {

	// Method to check if two strings are anagrams
	// Time Complexity: O(n log n) - due to sorting
	// Space Complexity: O(n) - for character arrays
	public static boolean checkAnagram(String str1, String str2) {

		// If the lengths of the strings are not equal, they can't be anagrams
		if (str1.length() != str2.length()) {
			return false;
		}

		// Convert strings to character arrays
		char[] cArr1 = str1.toCharArray();
		char[] cArr2 = str2.toCharArray();

		// Sort the character arrays
		Arrays.sort(cArr1);
		Arrays.sort(cArr2);

		// Compare the sorted arrays
		return Arrays.equals(cArr1, cArr2);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first string: ");
		String str1 = sc.nextLine();

		System.out.print("Enter the second string: ");
		String str2 = sc.nextLine();

		// Check and display whether the two strings are anagrams
		System.out.println(checkAnagram(str1, str2));

		sc.close();
	}
}
