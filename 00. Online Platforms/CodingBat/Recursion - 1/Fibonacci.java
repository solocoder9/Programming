import java.util.Scanner;

public class Fibonacci {
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

        int n = sc.nextInt();
        System.out.println(fibonacci(n));

        sc.close();
    }
}
