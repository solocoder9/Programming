import java.util.Scanner;

public class MoveZerosToEnd {

    // Method to move zeros to the end of the array
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static int[] moveZerosToEnd(int[] arr) {

        int[] modifiedArr = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                modifiedArr[index] = arr[i];
                index++;
            }
        }

        return modifiedArr;
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
        int[] modifiedArr = moveZerosToEnd(arr);

        // Print the modified array
        System.out.print("Array after moving zeros to the end: ");
        printArray(modifiedArr);

        sc.close();
    }
}
