import java.util.Scanner;

public class _30_NthFibonacciNumber {

    // Recursive method to find the Nth fibonacci number
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

        System.out.println(fibonacci(n));

        sc.close();
    }
}
