// Java program to check whether the number is Armstrong or not

import java.util.Scanner;

public class _05_ArmstrongNumber {

	// Method to check whether the number is Armstrong or not
	public static boolean checkArmstrong(int n) {

		int temp = n;
		int countDigit = 0;

		while (temp > 0) {
			countDigit++;
			temp /= 10;
		}

		temp = n; // Reset the temp variable
		int powerSum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			int remPower = 1;
			for (int i = 1; i <= countDigit; i++) {
				remPower *= rem;
			}
			powerSum += remPower;
			temp /= 10;
		}

		return n == powerSum;

	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = sc.nextInt();

		if (checkArmstrong(n)) {
			System.out.println(n + " is an Armstrong number");
		} else {
			System.out.println(n + " is not an Armstrong number");
		}

		sc.close();

	}
}
