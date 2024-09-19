import java.util.Scanner;

public class MissingNumber3 {

    // Method to find the missing number
    // Time Complexity: O(n) 
    // Space Complexity: O(1) 
    public static int findMissingNumber(int[] arr, int n) {
        int allXOR = 0;

        // XOR all numbers from 0 to n
        for (int i = 0; i <= n; i++) {
            allXOR ^= i;
        }

        // XOR all elements in the array
        for (int i : arr) {
            allXOR ^= i;
        }

        // The result is the missing number
        return allXOR;
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
