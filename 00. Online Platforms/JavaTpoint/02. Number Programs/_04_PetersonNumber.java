// Java program to check whether the number is Peterson or not

import java.util.Scanner;

public class _04_PetersonNumber {

	// Method to find the factorial of a number
	public static int findFactorial(int n) {
		int factorial = 1;
		for (int i = 2; i <= n; i++) {
			factorial *= i;
		}

		return factorial;
	}

	// Method to check whether the number is Peterson or not
	public static boolean checkPeterson(int n) {

		int temp = n;
		int sumOfFact = 0;

		while (temp > 0) {
			int rem = temp % 10;
			sumOfFact += findFactorial(rem);
			temp /= 10;
		}

		return n == sumOfFact;

	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = sc.nextInt();

		if (checkPeterson(n)) {
			System.out.println(n + " is an Peterson number");
		} else {
			System.out.println(n + " is not an Peterson number");
		}

		sc.close();

	}
}
