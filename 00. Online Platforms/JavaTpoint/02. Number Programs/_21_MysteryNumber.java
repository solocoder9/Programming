// Java program to check whether the number is a Mystery number or not

import java.util.Scanner;

public class _21_MysteryNumber {

	// Method to reverse a number
	public static int revNumber(int n) {

		int revNum = 0;

		while (n > 0) {
			revNum = (revNum * 10) + (n % 10);
			n /= 10;
		}

		return revNum;
	}

	// Method to check whether the number is a Mystery number or not
	public static boolean isMystery(int n) {

		for (int i = 1; i <= n / 2; i++) {
			if (i + revNumber(i) == n) {
				return true;
			}
		}

		return false;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number to check: ");
		int n = sc.nextInt();

		if (isMystery(n)) {
			System.out.println(n + " is a Mystery number");
		} else {
			System.out.println(n + " is not a Mystery number");
		}

		sc.close();
	}
}
