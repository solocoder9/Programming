import java.util.Scanner;

public class BinarySearch {

	// Method to perform binary search (works only on sorted arrays)
	public static int binarySearch(int[] arr, int target) {

		int low = 0;
		int high = arr.length - 1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			// check if the target is present at mid
			if (arr[mid] == target) {
				return mid;
			}

			// If target is greater, ignore the left half
			if (arr[mid] < target) {
				low = mid + 1;
			}
			// If target is smaller, ignore the right half
			else {
				high = mid - 1;
			}
		}

		return -1;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the arry: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.print("Enter elements of the array (in sorted order): ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the target value: ");
		int target = sc.nextInt();

		// Perform binary search
		int result = binarySearch(arr, target);

		// Display the result
		if (result != -1) {
			System.out.println("Element found at index: " + result);
		} else {
			System.out.println("Element not found.");
		}

		sc.close();
	}
}
