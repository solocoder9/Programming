import java.util.Scanner;

public class CopyArrayElement {
    
    // Print the array element in a given array
    static void printArray(int[] arr, int size) {

        int[] arr2 = new int[size];

        for(int i = 0; i <= arr.length - 1; i++) {
            arr2[i] = arr[i];
        }

        for(int i = 0; i <= arr2.length - 1; i++) {
            System.out.print(arr2[i] + " ");
        }
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

        printArray(arr, size);

        sc.close();
    }
}
