import java.util.Scanner;

public class HelloName {

	public static String helloName(String name) {
		return ("Hello " + name + "!");
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.print(helloName(str));

		sc.close();
	}
}
