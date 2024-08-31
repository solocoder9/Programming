// 0 0 1 1 2 4 7 13 24 44 

import java.util.Scanner;

public class TribonacciSeries {
    
    // Method to print Tribonacci series
    public static void tribonacci(int n) {
        
        int a = 0;
        int b = 0;
        int c = 1;

        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
    }

    // Driver method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        tribonacci(n);

        sc.close();
    }
}
