// Java program to check whether the number is Sunny or not

import java.util.Scanner;

public class _05_SunnyNumber {

	// Method to find the squre root of a number
	public static int squreRoot(int n) {

		int sqrt = 1;

		while (sqrt * sqrt <= n) {
			sqrt++;
		}

		return sqrt - 1;
	}

	// Method to check whether the number is Sunny or not
	public static boolean checkSunny(int n) {

		int sqrt = squreRoot(n + 1);
		
		return n == (sqrt * sqrt) - 1;

	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = sc.nextInt();

		if (checkSunny(n)) {
			System.out.println(n + " is an Sunny number");
		} else {
			System.out.println(n + " is not an Sunny number");
		}

		sc.close();

	}
}
