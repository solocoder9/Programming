import java.util.Scanner;

public class SumOfArrayElements {

    // Method to calculate the sum of all the elements of an array
    public static int printArray(int[] arr, int size) {

        int sum = 0;

        for (int i = 0; i <= arr.length - 1; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(printArray(arr, size));

        sc.close();
    }
}
