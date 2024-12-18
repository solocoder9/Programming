import java.util.Scanner;

public class CountInversions {

    // Method to count the number of inversions in the array
    // Time Complexity: O(n^2)
    // Space Complexity: O(1)
    public static int countInversions(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }

        return count;
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

        // Count and display the total number of inversions in the array
        System.out.println("Number of inversions is : " + countInversions(arr));

        sc.close();
    }
}
