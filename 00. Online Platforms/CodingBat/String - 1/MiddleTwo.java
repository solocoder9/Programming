import java.util.Scanner;

public class MiddleTwo {

	public static String middleTwo(String str) {
		if (str.length() == 2) {
			return str;
		} else {
			return str.substring((str.length() / 2) - 1, (str.length() / 2) + 1);
		}
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(middleTwo(str));

		sc.close();
	}
}
