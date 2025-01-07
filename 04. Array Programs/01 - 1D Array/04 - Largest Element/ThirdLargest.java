// Java program to find the third largest element in an array
// Efficient approach

import java.util.Scanner;

public class ThirdLargest {

    // Method to find the third largest element in an array
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int findThirdLargest(int[] arr) {

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest && arr[i] != firstLargest && arr[i] != secondLargest) {
                thirdLargest = arr[i];
            }
        }

        return thirdLargest;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input elements
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding and printing the third largest element
        System.out.println("Third largest element in the array is: " + findThirdLargest(arr));
        sc.close();
    }
}
