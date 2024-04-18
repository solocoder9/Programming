import java.util.Scanner;

public class PrintEvenElement {
    
    // Print even element of an array
    static void printArray(int[] arr, int size) {

        for(int i = 0; i <= arr.length - 1; i++) {
            if(arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
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
