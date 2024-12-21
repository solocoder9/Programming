import java.util.Scanner;

public class InsertAnElement3 {

    // Method to insert an element in an array
    public static int[] insertArry(int[] arr, int pos, int element) {
        if (pos < 1 || pos > arr.length + 1) {
            return arr;
        }

        for (int i = arr.length - 1; i >= pos; i--) {
            arr[i] = arr[i - 1];
        }

        arr[pos - 1] = element;

        return arr;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the position: ");
        int pos = sc.nextInt();

        System.out.print("Enter the element: ");
        int element = sc.nextInt();

        insertArry(arr, pos, element);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
