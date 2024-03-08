import java.util.Scanner;

public class PrintPimeNumberArray {
      
    // Method to check if the number is prime or not
    static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Print the array element if it is prime number
    static void printPrime(int[] arr, int size) {

        for (int num : arr) {
            if(checkPrime(num)) {
                System.out.print(num + " ");
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

        printPrime(arr, size);

        sc.close();
    }
}
