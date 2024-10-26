import java.util.Scanner;

public class DiagonalSum {

	// Method to calculate & print the diagonal sums of a 2D array
	public static void printDiagonalSums(int[][] arr) {
		int principalDSum = 0, secondaryDSum = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == j) {
					principalDSum += arr[i][j]; // Sum for principal diagonal
				}
				if (i + j == arr.length - 1) {
					secondaryDSum += arr[i][j]; // Sum for secondary diagonal
				}
			}
		}

		System.out.println("Principal Diagonal Sum: " + principalDSum);
		System.out.println("Secondary Diagonal Sum: " + secondaryDSum);
		System.out.println("Total Diagonal Sum: " + (principalDSum + secondaryDSum));
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of rows: ");
		int m = sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int n = sc.nextInt();

		int[][] arr = new int[m][n];

		// Input elements
		System.out.println("Enter the elements of the 2D array: ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		printDiagonalSums(arr);

		sc.close();
	}
}
