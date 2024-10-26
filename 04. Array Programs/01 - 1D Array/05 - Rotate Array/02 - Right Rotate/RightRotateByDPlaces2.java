import java.util.Scanner;

public class RightRotateByDPlaces2 {

	// Method to reverse a portion of the array from startIndex to endIndex
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static void reverse(int[] arr, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			startIndex++;
			endIndex--;
		}
	}

	// Method to right rotate an array by D places
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static void rightRotateByD(int[] arr, int d) {
		d = d % arr.length; // Handle cases where d >= n

		if (d == 0)
			return; // No rotation needed if d is 0

		// Reverse the entire array
		reverse(arr, 0, arr.length - 1);

		// Reverse the first part (from 0 to d-1)
		reverse(arr, 0, d - 1);

		// Reverse the second part (from d to end)
		reverse(arr, d, arr.length - 1);
	}

	// Method to print an array
	public static void printArray(int[] arr) {
		for (int i : arr) {
			System.out.print(i + " ");
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

		// Right rotate the array by D places
		System.out.print("Enter the number of positions to rotate: ");
		int d = sc.nextInt();
		rightRotateByD(arr, d);

		// Print the rotated array
		System.out.print("Array after right rotation: ");
		printArray(arr);

		sc.close();
	}
}
