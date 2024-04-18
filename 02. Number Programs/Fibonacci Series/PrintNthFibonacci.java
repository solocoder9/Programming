import java.util.Scanner;

public class PrintNthFibonacci {
    
    // Method to print Nth fibonacci number
    static void fibonacci(int n) {

        int a = 0;
        int b = 1;
        int c;
        

        for(int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.print("Nth fibonacci number is: " + a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}
