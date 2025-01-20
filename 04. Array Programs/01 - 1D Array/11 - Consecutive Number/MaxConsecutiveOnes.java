import java.util.Scanner;

public class MaxConsecutiveOnes {

	// Method to find the maximum consecutive ones
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static int findMaxCons(int[] arr) {

		int maxCons = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 1) {
				count++; // Increment count if the current element is 1
				maxCons = Math.max(maxCons, count); // Update max count if needed
			} else {
				count = 0; // Reset count
			}
		}

		return maxCons;
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

		// Find and display the maximum number of consecutive 1's
		System.out.println("Maximum number of consecutive 1's is: " + findMaxCons(arr));

		sc.close();
	}
}
