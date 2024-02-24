/*
 * Examples:
 * 
 * Input: 
 * n = 2
 * Output:
 * 0 1
 * 
 * Input:
 * n = 5
 * output:
 * 0 1 1 2 3
 */

import java.util.Scanner;

public class Fibonacci {
    
    // Method to print Fibonacci series up to the nth term
    static void fibonacci(int n) {

        int firstTerm = 0;
        int secondTerm = 1;

        if(n < 1) {
            System.out.print("Invalid input");
        }
        

        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm+ " ");
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
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
