import java.util.Scanner;

public class FibonacciSeries {

    // Method to print Nth fibonacci number
     public static void fibonacci(int n) {

        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }

        int a = 0;
        int b = 1;
        int c;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}
