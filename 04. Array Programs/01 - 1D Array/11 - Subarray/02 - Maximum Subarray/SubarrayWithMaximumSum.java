import java.util.Scanner;

public class SubarrayWithMaximumSum {
	
	// Method to find and print the subarray with the largest sum using Kadane's Algorithm
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static void printMaxSubArray(int[] arr) {
		
		int maxSum = arr[0]; 
		int currentSum = arr[0];
		int start = 0, end = 0, tempStart = 0; // Indices for the subarray

		for (int i = 1; i < arr.length; i++) {
			
			// Update the current subarray sum by including the current element
			if (arr[i] > currentSum + arr[i]) {
				currentSum = arr[i]; // Start a new subarray
				tempStart = i; // Update the temporary start index
			} else {
				currentSum += arr[i]; // Continue the current subarray
			}

			// If current sum exceeds max sum, update the maximum sum and subarray indices
			if (currentSum > maxSum) {
				maxSum = currentSum;
				start = tempStart; // Update the start index of the subarray
				end = i; // Update the end index of the subarray
			}
		}

		// Print the subarray with the maximum sum
		System.out.print("The subarray with the maximum sum is: ");
		for (int i = start; i <= end; i++) {
			System.out.print(arr[i] + " ");
		}
		
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

		// Print the subarray with the maximum sum
		printMaxSubArray(arr);

		sc.close();
	}
}
