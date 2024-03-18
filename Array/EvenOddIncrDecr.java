import java.util.Scanner;

public class EvenOddIncrDecr {
    
    // Method to sort even elements to the left and odd elementes to the right
    static int[] sortArray(int[] arr, int size) {

        // move even numbers to the begining
        int start = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = start; j < arr.length; j++) {
                if (arr[j] % 2 == 0) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    start = j + 1;;
                    break;
                }
            }
        }

        // sort even numbers in ascending and odd numbers in descending order
        for (int i = 0; i < arr.length; i++) {
            
            // Sorting even number in ascending order
            if (arr[i] % 2 == 0) {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] % 2 == 0 && arr[j+1] % 2 == 0) {
                        if (arr[j] > arr[j+1]) {
                            // Swap
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
                }
            }
            // Sorting odd numbers in descengin order
            else {
                for (int j = 0; j < arr.length - 1; j++) {
                    if (arr[j] % 2 != 0 && arr[j+1] % 2 != 0) {
                        if (arr[j] < arr[j+1]) {
                            // Swap
                            int temp = arr[j];
                            arr[j] = arr[j+1];
                            arr[j+1] = temp;
                        }
                    }
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

        sortArray(arr, size);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
