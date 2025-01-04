import java.util.Scanner;

public class PlusOut {

	public static String plusOut(String str, String word) {

		int len = word.length();
		String temp = "";

		for (int i = 0; i < str.length(); i++) {
			if (i + len <= str.length() && str.substring(i, i + len).equals(word)) {
				temp += word;
				i += len - 1;
			} else {
				temp += "+";
			}
		}

		return temp;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();
		String word = sc.next();

		System.out.println(plusOut(str, word));

		sc.close();
	}
}
