// Java program to find the GCD of two numbers
// using an optimized approach (Euclidean algorithm)

import java.util.Scanner;

public class GCDofTwoNumbers3 {
	
	// Method to find the GCD of two numbers using the Euclidean algorithm
	// Time Complexity: O(log(min(n1, n2)))
	// Space Complexity: O(1) - constant space
	public static int findGCD(int n1, int n2) {
		while (n2 != 0) {  
			int rem = n1 % n2;  
			n1 = n2;  
			n2 = rem; 
		}
		return n1;  
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();

		System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + findGCD(n1, n2));

		sc.close();
	}
}
