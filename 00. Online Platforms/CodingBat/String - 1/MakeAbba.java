package String_1;

import java.util.Scanner;

public class MakeAbba {

	public static String makeAbba(String a, String b) {
		return (a + b + b + a);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		System.out.print(makeAbba(a, b));

		sc.close();
	}
}
