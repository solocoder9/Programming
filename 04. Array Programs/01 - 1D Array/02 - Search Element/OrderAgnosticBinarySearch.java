import java.util.Scanner;

public class OrderAgnosticBinarySearch {

    // Method to perform binary search (Order-Agnostic)
    public static int binarySearch(int[] arr, int target) {
        if (arr == null || arr.length == 0) return -1;

        int start = 0;
        int end = arr.length - 1;

        // Find whether the array is sorted in ascending or descending
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1; // target not found
    }


    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter elements of the array (in sorted order): ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target value: ");
        int target = sc.nextInt();

        // Perform binary search
        int result = binarySearch(arr, target);

        // Display the result
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }

        sc.close();
    }
}
