import java.util.Scanner;

public class MaximumSubarraySum2 {

    // Method to find the subarray with the largest sum using Kadane's Algorithm
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int largestSum(int[] arr) {
        int maxSum = arr[0];
        int currentSum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Update current sum by including the current element
            currentSum = Math.max(arr[i], currentSum + arr[i]);

            // Update the max sum if the current sum is greater
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
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

        // Find and display the maximum subarray sum
        System.out.println("The maximum subarray sum is: " + largestSum(arr));

        sc.close();
    }
}
