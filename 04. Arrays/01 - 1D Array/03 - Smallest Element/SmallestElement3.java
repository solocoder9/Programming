// Java program to find the smallest element in an array
// Efficient approach

import java.util.Scanner;

public class SmallestElement3 {

	// Method to find the smallest element in an array
	// Time Complexity: O(n)
	// Space Complexity: O(n)
	public static int findSmallest(int[] arr) {

		int smallest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			}
		}

		return smallest;
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

		System.out.println("Largest element in the array is: " + findSmallest(arr));

		sc.close();
	}
}
