package String_1;

import java.util.Scanner;

public class NonStart {

	public static String nonStart(String a, String b) {
		return a.substring(1) + b.substring(1);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();

		System.out.print(nonStart(a, b));

		sc.close();
	}
}
