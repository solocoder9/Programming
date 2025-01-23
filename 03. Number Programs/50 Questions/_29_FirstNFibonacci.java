import java.util.Scanner;

public class _29_FirstNFibonacci {

    // Method to print the first n fibonacci numbers
    public static void printFibonacci(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Helper method to find the nth fibonacci number
    public static int fibonacci(int n) {
        // Base case
        if (n <= 1) {
            return n;
        }

        // Recursive case
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printFibonacci(n);

        sc.close();
    }
}
