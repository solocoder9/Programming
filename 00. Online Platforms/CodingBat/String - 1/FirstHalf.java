package String_1;

import java.util.Scanner;

public class FirstHalf {

	public static String firstHalf(String str) {
		return str.substring(0, str.length() / 2);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(firstHalf(str));

		sc.close();
	}
}
