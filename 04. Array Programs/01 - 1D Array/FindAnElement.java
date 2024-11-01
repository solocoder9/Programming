import java.util.Scanner;

public class FindAnElement {

	// Method to find an element in an array using linear search
	public static int findElement(int[] arr, int element) {

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
		int n = sc.nextInt();

		int[] arr = new int[n];

		// Input elements
		System.out.print("Enter elements of the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the element to search: ");
		int element = sc.nextInt();

		// Display the result
		System.out.println("Element found at index number: " + findElement(arr, element));

		sc.close();
	}
}
