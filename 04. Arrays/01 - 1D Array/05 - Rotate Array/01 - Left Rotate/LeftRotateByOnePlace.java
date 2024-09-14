import java.util.Scanner;

public class LeftRotateByOnePlace {

	// Method to left rotate an array by one place
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static void leftRotate(int[] arr) {

		int temp = arr[0];

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}

		arr[arr.length - 1] = temp;
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

		// Rotate the array
		leftRotate(arr);

		// Print the rotated array
		System.out.print("Array after left rotation: ");
		printArray(arr);

		sc.close();
	}
}
