import java.util.Arrays;
import java.util.Scanner;

public class LonelyInteger {

    // Method to find the lonely integer in an array
    // Time Complexity: O(n log n)
    // Space Complexity: O(1) 
    public static int findLonely(int[] arr) {
       
        Arrays.sort(arr);

        
        for (int i = 0; i < arr.length - 2; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        // If no lonely integer found in pairs, the last element must be the lonely one
        return arr[arr.length - 1];
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the size of the array (must be odd): ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements into the array
        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Find and display the lonely integer
        System.out.println("The lonely integer is: " + findLonely(arr));

        sc.close();
    }
}
