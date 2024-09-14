import java.util.Scanner;

public class MoveZerosToEnd2 {

    // Method to move zeros to the end of the array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void moveZerosToEnd(int[] arr) {
        int nonZeroIndex = 0;

        // Traverse the array and move non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // Swap elements
                int temp = arr[nonZeroIndex];
                arr[nonZeroIndex] = arr[i];
                arr[i] = temp;
                nonZeroIndex++;
            }
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

        // Move zeros to the end of the array
        moveZerosToEnd(arr);

        // Print the modified array
        System.out.print("Array after moving zeros to the end: ");
        printArray(arr);

        sc.close();
    }
}
