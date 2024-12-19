import java.util.Scanner;

public class MissingNumber {

    // Method to find the missing number
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int findMissingNumber(int[] arr, int n) {
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                return i;
            }
        }
        return -1;
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
