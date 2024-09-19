import java.util.Scanner;

public class MissingNumber2 {

    // Method to find the missing number
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = (n * (n + 1)) / 2;
        int sum = 0;

        // Calculate the sum of the given array elements
        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        // The missing number is the difference between expected sum and actual sum
        return expectedSum - sum;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int[] arr = new int[n - 1];

        // Input elements
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and display the missing number
        System.out.println("The missing number is: " + findMissingNumber(arr, n));

        sc.close();
    }
}
