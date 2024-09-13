import java.util.Scanner;

public class PrintDuplicates {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Method to print duplicate elements of an array
    public static void printDuplicate(int[] arr) {

        boolean isPresent = false;
        System.out.print("Duplicates: ");

        // Iterate through the array
        for (int i = 0; i < arr.length - 1; i++) {
            // Check if the current element is a duplicate
            boolean isDuplicate = false;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break; // Move to the next element after finding the first duplicate
                }
            }
            // If the current element is a duplicate, print it
            if (isDuplicate) {
                boolean alreadyPrinted = false;
                for (int k = i - 1; k >= 0; k--) {
                    if (arr[i] == arr[k]) {
                        alreadyPrinted = true;
                        break;
                    }
                }
                if (!alreadyPrinted) {
                    System.out.print(arr[i] + " ");
                    isPresent = true;
                }
            }
        }

        if (!isPresent) {
            System.out.println("No duplicates present in array");
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int len = sc.nextInt();

        int[] arr = new int[len];

        // Input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        printDuplicate(arr);

        sc.close();
    }
}
