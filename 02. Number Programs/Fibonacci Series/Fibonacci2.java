import java.util.Scanner;

public class Fibonacci2 {
    
    // Method to print Fibonacci series
    static void fibonacci(int n) {

        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        

        for(int i = 3; i <= n; i++) {
            int c = a + b;
            System.out.print(c+ " ");
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
