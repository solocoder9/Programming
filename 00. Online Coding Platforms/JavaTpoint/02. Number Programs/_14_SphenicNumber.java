// Java program to check whether the number is Sphenic number or not

import java.util.Scanner;

public class _14_SphenicNumber {

	// Method to check whether the number is prime or not
	public static boolean isPrime(int n) {

		if (n <= 1) {
			return false;
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

	// Method to check whether the number is Sphenic number or not
	public static boolean isSphenic(int num) {

		int count = 0;
		int product = 1;
		int temp = num;

		for (int i = 2; i <= temp; i++) {
			if (isPrime(i) && temp % i == 0) {
				count++;
				product *= i;
				temp /= i;
				// check if the prime factors repeats
				if (temp % i == 0) {
					return false;
				}
			}
		}

		return count == 3 && product == num;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number to check: ");
		int num = sc.nextInt();

		if (isSphenic(num)) {
			System.out.println(num + " is a sphenic number");
		} else {
			System.out.println(num + " is not a sphenic number");
		}

		sc.close();
	}
}
