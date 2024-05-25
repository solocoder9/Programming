// Java program to find the GCD of two numbers
// Brute force approach (concise)

import java.util.Scanner;

public class GCDofTwoNumbers2 {

	// Method to find the GCD of two numbers
	// Using while loop
	public static int findGCD(int n1, int n2) {

		int min = Math.min(n1, n2);
		while (min > 0) {
			if (n1 % min == 0 && n2 % min == 0) {
				break;
			}
			min--;
		}

		return min;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();

		System.out.println(findGCD(n1, n2));

		sc.close();

	}
}
