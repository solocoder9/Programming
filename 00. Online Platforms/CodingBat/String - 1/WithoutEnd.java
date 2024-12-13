import java.util.Scanner;

public class WithoutEnd {

	public static String withoutEnd(String str) {
		if (str.length() <= 2) {
			return "";
		}
		return str.substring(1, str.length() - 1);
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(withoutEnd(str));

		sc.close();
	}
}
