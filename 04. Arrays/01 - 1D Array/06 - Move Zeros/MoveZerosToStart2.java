import java.util.Scanner;

public class MoveZerosToStart2 {

    // Method to move zeros to the start of the array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void moveZerosToStart(int[] arr) {
        int zeroIndex = arr.length - 1; // Start from the end of the array

        // Traverse the array from end to start
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] != 0) {
                // Swap elements
                int temp = arr[zeroIndex];
                arr[zeroIndex] = arr[i];
                arr[i] = temp;
                zeroIndex--; // Move zeroIndex leftward
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

        // Move zeros to the start of the array
        moveZerosToStart(arr);

        // Print the modified array
        System.out.print("Array after moving zeros to the start: ");
        printArray(arr);

        sc.close();
    }
}
