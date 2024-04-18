// Program to print the Fibonacci series 
// Example - 0, 1, 1, 2, 3, 5, 13, 21

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int num1 = 0, num2 = 1;

        for(int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            //Swap
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }

        sc.close();
    }    
}
