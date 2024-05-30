// Java program to check whether the number is prime or not

import java.util.Scanner;

public class _02_PrimeNumber {
	
	// Method to check whether the number is prime or not
	public static boolean checkPrime(int n) {
		
		if (n <= 1) {
			
		} else if (n <= 3) {
			return true;
		} else if (n % 2 == 0 || n % 3 == 0) {
			return false;
		}
		
		for (int i = 5; i * i <= n; i += 6) {
			if (n % i == 0 || n % (i + 2) == 0) {
				return false;
			}
		}
		
		return true;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter any number: ");
		int n = sc.nextInt();
		
		if (checkPrime(n)) {
			System.out.println(n + " is a prime number");
		} else {
			 System.out.println(n + " is not a prime number");
		}
		
		sc.close();
	} 
}
