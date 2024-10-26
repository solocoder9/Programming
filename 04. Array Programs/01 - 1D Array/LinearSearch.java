import java.util.Scanner;

public class LinearSearch {

	// Method to perform linear search
	public static int searchElement(int[] arr, int element) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == element) {
				return i;
			}
		}

		return -1;
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

		System.out.print("Enter the element to search: ");
		int element = sc.nextInt();
		int elementIndex = searchElement(arr, element);

		// Display the result
		if (elementIndex != -1) {
			System.out.println("Element found at index number: " + elementIndex);
		} else {
			System.out.println("Element not found in the array.");
		}

		sc.close();
	}
}
