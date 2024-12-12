import java.util.Scanner;

public class GHappy {

	public static boolean gHappy(String str) {

		if (str.length() == 0) {
			return true;
		} else if (str.length() == 1 && str.charAt(0) == 'g') {
			return false;
		}
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'g') {
				if (i == 0) {
					if (str.charAt(i + 1) != 'g') {
						return false;
					}
				} else if (i == str.length() - 1) {
					if (str.charAt(i - 1) != 'g') {
						return false;
					}
				} else {
					if (str.charAt(i - 1) != 'g' && str.charAt(i + 1) != 'g') {
						return false;
					}
				}
			}
		}

		return true;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		System.out.println(gHappy(str));

		sc.close();

	}
}
