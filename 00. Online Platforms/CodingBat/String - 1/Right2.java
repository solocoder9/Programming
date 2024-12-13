import java.util.Scanner;

public class Right2 {

	public static String right2(String str) {
		if (str.length() <= 2) {
			return str;
		} else {
			return str.substring(str.length() - 2) + str.substring(0, str.length() - 2);
		}
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(right2(str));

		sc.close();
	}
}
