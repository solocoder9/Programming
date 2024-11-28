import java.util.Scanner;

public class FactorialOfANumber2 {

	// Method to calculate the factorial of a number
    // Recursive approach
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		}

		return n * factorial(n - 1);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter any number: ");
		int n = sc.nextInt();

		System.out.println("Factorial of " + n + " is: " + factorial(n));
		
		sc.close();
	}
}
