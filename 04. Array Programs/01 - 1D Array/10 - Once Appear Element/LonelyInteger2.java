import java.util.HashSet;
import java.util.Scanner;

public class LonelyInteger2 {

    // Method to find the lonely integer in an array
    // Time Complexity: O(n)
    // Space Complexity: O(n) for the HashSet
    public static int findLonely(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i : arr) {
            // If the integer is already in the set, remove it
            if (hs.contains(i)) {
                hs.remove(i);
            } else {
                // If not, add it to the set
                hs.add(i);
            }
        }

        // The only element left in the set is the lonely integer
        for (int i : hs) {
            return i;
        }

        return -1; // In case no lonely integer is found (should not happen with valid input)
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
