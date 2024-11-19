import java.util.Scanner;

public class Anagram3 {

	// Method to check if two strings are anagrams
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static boolean checkAnagram(String s1, String s2) {

		// If the lengths of the strings are not equal, they can't be anagrams
		if (s1.length() != s2.length()) {
			return false;
		}

		// Frequency array to store the count of each character
		int[] charFrequency = new int[256]; // Size 256 for extended ASCII character set

		// Traverse both strings and update the frequency array
		for (int i = 0; i < s1.length(); i++) {
			charFrequency[s1.charAt(i)]++; // Increment frequency for characters in s1
			charFrequency[s2.charAt(i)]--; // Decrement frequency for characters in s2
		}

		// Check if all counts in the frequency array are zero
		for (int i = 0; i < charFrequency.length; i++) {
			if (charFrequency[i] != 0) {
				return false; 
			}
		}

		return true; 
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Take input for the two strings
		System.out.print("Enter the first string: ");
		String s1 = sc.nextLine();

		System.out.print("Enter the second string: ");
		String s2 = sc.nextLine();

		// Check and display whether the two strings are anagrams
		boolean result = checkAnagram(s1, s2);
		if (result) {
			System.out.println("The two strings are anagrams.");
		} else {
			System.out.println("The two strings are not anagrams.");
		}

		sc.close();
	}
}
