import java.util.Scanner;

public class RightRotateByOnePlace {

    // Method to right rotate an array by one place
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void rightRotate(int[] arr) {
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = temp;
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

        // Rotate the array
        rightRotate(arr);

        // Print the rotated array
        System.out.print("Array after right rotation: ");
        printArray(arr);

        sc.close();
    }
}
