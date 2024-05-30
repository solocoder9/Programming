// Java program to find the factorial of a number

import java.util.Scanner;

public class _04_FactorialOfaNumber {

	// Method to find the factorial of a number
	public static int findFactorial(int n) {

		int fact = 1;

		for (int i = 2; i <= n; i++) {
			fact *= i;
		}

		return fact;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = sc.nextInt();

		System.out.println("Factorial of " + n + " is: " + findFactorial(n));

		sc.close();
	}
}
