import java.util.Scanner;

public class MoveZerosToStart2 {
    
    // Method to move zeros to the beggining 
    static int[] moveZero(int[] arr, int size) {

        int index = 0;
        int temp = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == 0) {
                temp = arr[index];
                arr[index] = arr[i];
                arr[i] = temp;
                index++;
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
