// Java program to find the factorial of a given number

import java.util.Scanner;

public class FactorialOfaNumber {

	// Method to find the factorial of a given number
	public static long factorial(int n) {

		if (n <= 1) {
			return 1;
		}

		long fact = 1;
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

		System.out.println("Factorial of " + n + " is: " + factorial(n));

		sc.close();
	}
}