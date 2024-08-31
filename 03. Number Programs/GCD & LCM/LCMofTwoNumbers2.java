// Java program to find the LCM of two numbers
// Most efficient approach 

import java.util.Scanner;

public class LCMofTwoNumbers2 {

	// Method to find the GCD of two numbers using the Euclidean algorithm
	// Time Complexity: O(log(min(n1, n2)))
	// Space Complexity: O(1) - constant space
	public static int findGCD(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	// Method to find the LCM of two numbers using GCD
	public static int findLCM(int a, int b) {
		// LCM = (a * b) / GCD
		return (a * b) / findGCD(a, b);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();

		System.out.println("LCM  of " + n1 + " and " + n2 + " is: " + findLCM(n1, n2));

		sc.close();
	}
}
