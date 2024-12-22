import java.util.Scanner;

public class ExtraEnd {

	public static String extraEnd(String str) {
		return (str.substring(str.length() - 2) + str.substring(str.length() - 2) + str.substring(str.length() - 2));
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(extraEnd(str));

		sc.close();
	}
}
