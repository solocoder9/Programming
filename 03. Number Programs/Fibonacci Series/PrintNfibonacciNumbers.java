import java.util.Scanner;

public class PrintNfibonacciNumbers {
    
    // Method to print n Fibonacci number starting from 1
    static void printfibo(int n) {
        int a = 0; 
        int b = 1;

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b; 
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printfibo(n);

        sc.close();
    }
}
