import java.util.Scanner;

public class LeftRotateByDPlaces {

    // Method to left rotate an array by 1 place
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static void leftRotate(int[] arr) {

        int temp = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = temp;
    }

    // Method to left rotate an array by d places
    // Time Complexity: O(d * n) where d is the number of rotations
    // Space Complexity: O(1)
    public static void leftRotateByD(int[] arr, int d) {

        d = d % arr.length; // Handle cases where d >= arr.length

        for (int i = 1; i <= d; i++) {
            leftRotate(arr);
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

        // Left rotate the array by d places
        System.out.print("Enter the number of positions to rotate: ");
        int d = sc.nextInt();
        leftRotateByD(arr, d);

        // print the rotated array
        System.out.print("After rotating the array: ");
        printArray(arr);

        sc.close();
    }
}
