import java.util.Scanner;

public class ZerosMoveToFirst {
    
    // Method to move zeros to the beggining 
    static int[] moveZero(int[] arr, int size) {

        int temp = 0;

        for (int i = 0; i < arr.length ; i++) {
            
            for (int j = i; j < arr.length; j++) {
                if (arr[j] == 0) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        moveZero(arr, size);

        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
