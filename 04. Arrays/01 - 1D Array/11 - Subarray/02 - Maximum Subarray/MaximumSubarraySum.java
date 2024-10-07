import java.util.Scanner;

public class MaximumSubarraySum {

    // Method to find the subarray with the largest sum
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int largestSum(int[] arr) {
        int largestSum = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                largestSum = Math.max(largestSum, sum);
            }
        }

        return largestSum;
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
