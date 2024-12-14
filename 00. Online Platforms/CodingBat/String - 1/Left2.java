import java.util.Scanner;

public class Left2 {

	public static String left2(String str) {
		if (str.length() <= 2) {
			return str;
		} else {
			return str.substring(2) + str.substring(0, 2);
		}
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(left2(str));

		sc.close();
	}
}
