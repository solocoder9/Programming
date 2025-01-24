import java.util.Scanner;

public class _33_NthFibonacciNumber {

    // Method to find the Nth even Fibonacci number
    public static int nthNthEvenFibonacci(int n) {
        int a = 0, b = 1;

        while (n >= 1) {
            if (b % 2 == 0) {
                n--;
            }
            int c = a + b;
            a = b;
            b = c;
        }

        return a;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(nthNthEvenFibonacci(n));

        sc.close();
    }
}
