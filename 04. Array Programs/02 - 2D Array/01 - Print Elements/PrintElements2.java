import java.util.Scanner;

public class PrintElements2 {

	// Method to print the 2D array
	public static void print(int[][] arr) {
		for (int[] row : arr) {
			for (int element : row) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Get the size of the 2D array
		System.out.print("Enter the number of rows: ");
		int m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int n = sc.nextInt();

		int[][] arr = new int[m][n];

		// Input elements for the 2D array
		System.out.println("Enter the elements of the 2D array:");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// Print the 2D array
		System.out.println("The elements of the 2D array are:");
		print(arr);

		sc.close();
	}
}
