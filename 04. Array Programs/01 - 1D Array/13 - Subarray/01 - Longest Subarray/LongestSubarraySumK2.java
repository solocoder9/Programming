import java.util.Scanner;

public class LongestSubarraySumK2 {

	// Method to find the longest subarray with sum k
	// Time Complexity: O(n^2)
	// Space Complexity: O(1)
	public static int longestSubarr(int[] arr, int k) {

		int longestSubLen = 0;

		for (int i = 0; i < arr.length; i++) {
			int subArrSum = 0;
			for (int j = i; j < arr.length; j++) {
				subArrSum += arr[j];
				if (subArrSum == k) {
					longestSubLen = Math.max(longestSubLen, j - i + 1);
				}
			}
		}

		return longestSubLen;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// Input elements
		System.out.print("Enter elements of the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the target sum (k): ");
		int k = sc.nextInt();

		// Find and display the longest subarray with the sum k
		System.out.println("The length of the longest subarray with the sum of " + k + " is: " + longestSubarr(arr, k));

		sc.close();
	}
}
