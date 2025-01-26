import java.util.Scanner;

public class _30_NthFibonacciNumber {

    // Method to find the Nth fibonacci number
    public static int fibonacci(int n) {
        int a = 0, b = 1;

        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }

        return b;
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
