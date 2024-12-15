import java.util.Scanner;

public class FirstTwo {

	public static String firstTwo(String str) {
		if (str.length() < 2) {
			return str;
		}

		return str.substring(0, 2);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(firstTwo(str));

		sc.close();
	}
}
