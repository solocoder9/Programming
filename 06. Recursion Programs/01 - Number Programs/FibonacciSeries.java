import java.util.Scanner;

public class FibonacciSeries {

    // Method to print fibonacci series
    public static void fibonacciSeries(int n) {

        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    // Recursive method to find the nth Fibonacci number
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

        fibonacciSeries(n);

        sc.close();
    }
}
