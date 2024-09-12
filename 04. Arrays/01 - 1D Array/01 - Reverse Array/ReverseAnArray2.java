import java.util.Scanner;

public class ReverseAnArray2 {

    // Method to reverse an array using two-pointer approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public static int[] reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        
        return arr;
    }

    // Method to print array elements
    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
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
        
        // Reverse and print the array
        System.out.print("Reversed array: ");
        printArray(reverseArray(arr));
        
        sc.close();
    }
}
