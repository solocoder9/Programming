import java.util.Scanner;

public class MakeOutWord {

	public static String makeOutWord(String out, String word) {
		return (out.substring(0, 2) + word + out.substring(2));
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String out = sc.next();
		String word = sc.next();

		System.out.print(makeOutWord(out, word));

		sc.close();
	}
}
