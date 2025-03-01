import java.util.Scanner;

public class FindCommonElements {

    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    // Method to find and print common elements between two arrays
    public static void findCommonElements(int[] arr1, int[] arr2) {
        // Iterate through each element of the first array
        for (int i : arr1) {
            // Compare the current element with each element of the second array
            for (int j : arr2) {
                if (i == j) {
                    // Print the common element
                    System.out.print(i + " ");
                }
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
