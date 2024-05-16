// Java program to print the Fibonacci series up to nth term

import java.util.Scanner;

public class Fibonacci2 {
    
    // Method to print Fibonacci series up to nth term
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

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        fibonacci(n);

        sc.close();
    }
}
