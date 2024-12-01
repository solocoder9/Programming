import java.util.Scanner;

public class SwapTwoNumbers3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the value of a: ");
		int a = sc.nextInt();
		System.out.print("Enter the value of b: ");
		int b = sc.nextInt();

		// Method to swap two numbers using a XOR operator
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swapping:");
		System.out.println("a: " + a);
		System.out.println("b: " + b);

		sc.close();
	}
}
