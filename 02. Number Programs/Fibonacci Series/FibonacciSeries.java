import java.util.Scanner;

public class FibonacciSeries {
    
    // Method to print Nth fibonacci number
    static void fibonacci(int n) {

        int a = 0;
        int b = 1;
        int c;
        

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}
