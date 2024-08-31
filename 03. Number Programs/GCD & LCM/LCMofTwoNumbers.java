// Java program to find the LCM of two numbers
// Brute force approach

import java.util.Scanner;

public class LCMofTwoNumbers {
	
	// Method to find the LCM of two numbers
	// using while loop
	public static int findLCM(int n1, int n2) {
		int lcm = (n1 > n2) ? n1 : n2;
		
		while (true) {
			if (lcm % n1 == 0 && lcm % n2 == 0) {
				break;
			}
			lcm++;
		}
		return lcm;
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
