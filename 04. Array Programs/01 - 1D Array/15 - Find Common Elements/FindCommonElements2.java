import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindCommonElements2 {

    // Time Complexity: O(m + n)
    //   - O(m) for inserting elements of arr1 into the set.
    //   - O(n) for checking elements of arr2 in the set.
    // Space Complexity: O(m)
    // Method to find and print common elements between two arrays
    public static void findCommonElements(int[] arr1, int[] arr2) {
        // Use a set to store elements of arr1
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }

        // Check if elements from arr2 exist in the set (common elements)
        for (int num : arr2) {
            if (set.contains(num)) {
                System.out.print(num + " ");
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
