import java.util.Scanner;

public class ReverseAnArray {

    // Method to reverse an array
    // Time Complexity: O(n)
    // Space Complexity: O(n) for storing the reversed array
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            reversedArray[i] = arr[arr.length - 1 - i];
        }

        return reversedArray;
    }

    // Method to print array elements
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

        // Reversed array
        int[] arr2 = reverseArray(arr);

        // Print reversed array elements
        System.out.print("Reversed array: ");
        printArray(arr2);

        sc.close();
    }
}
