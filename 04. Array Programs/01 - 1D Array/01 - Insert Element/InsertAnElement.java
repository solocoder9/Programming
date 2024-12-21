import java.util.Scanner;

public class InsertAnElement {

    // Method to insert an element in an array
    public static int[] insertElement(int[] arr, int pos, int element) {

        // Validate position
        if (pos < 1 || pos > arr.length + 1) {
            System.out.println("Invalid position! Position must be between 1 and " + (arr.length + 1));
            return arr; // Return the original array if position is invalid
        }

        int[] arr2 = new int[arr.length + 1];

        // Copy elements before the insertion point
        for (int i = 0; i < pos - 1; i++) {
            arr2[i] = arr[i];
        }

        // Insert the new element
        arr2[pos - 1] = element;

        // Copy the remaining elements
        for (int i = pos; i < arr2.length; i++) {
            arr2[i] = arr[i - 1];
        }

        return arr2;
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

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the position to insert at: ");
        int pos = sc.nextInt();

        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        int[] updatedArr = insertElement(arr, pos, element);
        printArray(updatedArr);

        sc.close();
    }
}
