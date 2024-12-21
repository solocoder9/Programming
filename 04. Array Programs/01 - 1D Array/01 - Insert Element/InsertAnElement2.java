import java.util.Scanner;

public class InsertAnElement2 {

    // Method to insert an element into an array at a specific position
    public static int[] insertElement(int[] arr, int pos, int element) {

        // Validate position
        if (pos < 1 || pos > arr.length + 1) {
            System.out.println("Invalid position! Position must be between 1 and " + (arr.length + 1));
            return arr; // Return the original array if the position is invalid
        }

        int[] arr2 = new int[arr.length + 1];

        // Shift elements to the right to make space for the new element
        for (int i = arr2.length - 1; i >= pos; i--) {
            arr2[i] = arr[i - 1];
        }

        // Insert the new element at the specified position
        arr2[pos - 1] = element;

        // Copy the elements from the original array before the insertion point
        for (int i = 0; i < pos - 1; i++) {
            arr2[i] = arr[i];
        }

        return arr2;
    }

    // Method to print the elements of an array
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline at the end
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
