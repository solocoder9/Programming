import java.util.Scanner;

public class RightRotateByDPlaces {

	// Method to right rotate an array by one place
	// Time Complexity: O(n)
	// Space Complexity: O(1)
	public static void rightRotate(int[] arr) {
		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}

		arr[0] = temp;
	}

	// Method to right rotate an array by D places
	// Time Complexity: O(d * n) where d is the number of rotations
	// Space Complexity: O(1)
	public static void rightRotateByD(int[] arr, int d) {
		d = d % arr.length; // Handle cases where d >= arr.length

		for (int i = 1; i <= d; i++) {
			rightRotate(arr);
		}
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
		System.out.print("Enter the number of position to rotate: ");
		int d = sc.nextInt();
		rightRotateByD(arr, d);

		// Print the rotated array
		System.out.print("Aarray after rotation: ");
		printArray(arr);

		sc.close();
	}
}
