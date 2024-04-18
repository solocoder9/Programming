import java.util.Scanner;

public class ProductOfArrayElements {
    
    // Method to calculate the sum of all the elements of an array
    static int printArray(int[] arr, int size) {

        int product = 1;

        for(int i = 0; i <= arr.length - 1; i++) {
            product *= arr[i];
        }

        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i <= arr.length -1; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(printArray(arr, size));

        sc.close();
    }
}
