import java.util.Scanner;

public class RemoveDuplicates {

	// Method to remove duplicates from a sorted array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
	public static int removeDuplictes(int[] arr) {
		int lastUniqueElement = 0;

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[lastUniqueElement]) {
				lastUniqueElement++;
				arr[lastUniqueElement] = arr[i];
			}
		}

		return lastUniqueElement + 1; 
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

		// Remove duplicates and print the array
		int newSize = removeDuplictes(arr);
		System.out.print("After removing the duplicates: ");
		for(int i = 0; i < newSize; i++) {
			System.out.print(arr[i] + " ");
		}

		sc.close();
	}
}
