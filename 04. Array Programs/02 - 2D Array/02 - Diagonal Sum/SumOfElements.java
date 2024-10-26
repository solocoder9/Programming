import java.util.Scanner;

public class SumOfElements {

    // Method to calculate the sum of elements of a 2D array
    public static int sumOf2D(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
        }
        return sum;
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
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Calculate and display the sum of the 2D array
        System.out.println("Sum of the 2D array: " + sumOf2D(arr));

        sc.close();
    }
}
