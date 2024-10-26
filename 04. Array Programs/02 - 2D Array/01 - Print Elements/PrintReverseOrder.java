import java.util.Scanner;

public class PrintReverseOrder {

    // Method to print 2D array in reverse order
    public static void print2DArray(int[][] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
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

        // Print the 2D array in reverse order
        System.out.println("The elements of the 2D array in reverse order are:");
        print2DArray(arr);

        sc.close();
    }
}
