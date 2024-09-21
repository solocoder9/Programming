import java.util.Scanner;

public class LonelyInteger3 {

	// Method to find the lonely integer in an array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int findLonely(int[] arr) {
        int lonely = 0;

        // XOR each element with the lonely variable
        for (int i : arr) {
            lonely ^= i;
        }

        // The result will be the lonely integer
        return lonely;
    }
	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of the array (must be odd): ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		// Input elements into the array
		System.out.print("Enter elements of the array: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		// Find and display the lonely integer
		System.out.println("The lonely integer is: " + findLonely(arr));

		sc.close();
	}
}
