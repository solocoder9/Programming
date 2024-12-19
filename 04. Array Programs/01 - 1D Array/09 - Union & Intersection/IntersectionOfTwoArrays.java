import java.util.Scanner;

public class IntersectionOfTwoArrays {

    // Method to get the intersection of two sorted arrays, including duplicates
    public static int[] intersectionArrays(int[] arr1, int[] arr2) {
        int m = arr1.length;
        int n = arr2.length;

        // Create a temporary array to store the intersection
        int[] temp = new int[Math.min(m, n)];
        int k = 0; // Index for temp array
        int i = 0, j = 0;

        // Traverse both arrays
        while (i < m && j < n) {
            if (arr1[i] == arr2[j]) {
                // Add element to temp if it's a common element
                temp[k++] = arr1[i];
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // Create the final intersection array with exact size
        int[] result = new int[k];
        System.arraycopy(temp, 0, result, 0, k);

        return result;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // For first array
        System.out.print("Enter the size of array1: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.print("Enter elements of array1: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }

        // For second array
        System.out.print("Enter the size of array2: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.print("Enter elements of array2: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        // Intersection of two arrays
        int[] intersection = intersectionArrays(arr1, arr2);

        System.out.print("Intersection of the two arrays: ");
        for (int i : intersection) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
