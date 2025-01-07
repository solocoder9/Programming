// Java program to find the smallest element in an array
// Optimized approach

import java.util.Scanner;
import java.util.Arrays;

public class SmallestElement2 {

    // Method to find the smallest element in an array
    // Time Complexity: O(n log n)
    // Space Complexity: O(n)
    public static int findSmallest(int[] arr) {

        // Sorting the array using Arrays.sort()
        Arrays.sort(arr);

        return arr[0];
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

        System.out.println("Smallest element in the array is: " + findSmallest(arr));

        sc.close();
    }
}
