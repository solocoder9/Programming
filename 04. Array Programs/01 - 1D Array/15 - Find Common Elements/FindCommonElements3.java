import java.util.Arrays;
import java.util.Scanner;

public class FindCommonElements3 {

    // Time Complexity: O(n log n + m log m)
    //   - O(n log n) for sorting arr1.
    //   - O(m log m) for sorting arr2.
    // Space Complexity: O(1)
    // Method to find and print common elements between two arrays
    public static void findCommonElements(int[] arr1, int[] arr2) {
        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Two-pointer approach
        int i = 0;
        int j = 0;

        // Traverse both arrays and print common elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                i++; // Move the pointer of arr1 forward if arr1[i] is smaller
            } else if (arr1[i] > arr2[j]) {
                j++; // Move the pointer of arr2 forward if arr2[j] is smaller
            } else {
                System.out.println(arr1[i]); // Print the common element
                i++;
                j++;
            }
        }

    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input for the first array
        System.out.print("Enter the size of the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements for the first array: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input for the second array
        System.out.print("Enter the size of the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter elements for the second array: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // Display the common elements
        System.out.print("Common elements are: ");
        findCommonElements(arr1, arr2);

        sc.close();
    }
}
