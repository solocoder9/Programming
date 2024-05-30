// Java program to print the Fibonacci series

import java.util.Scanner;

public class _01_FibonacciSeries {

	// Method to print Fibonacci series
	public static void fiboSeries(int n) {

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

		fiboSeries(n);

		sc.close();
	}
}
