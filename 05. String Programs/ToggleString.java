import java.util.Scanner;

public class ToggleString {
    // Method to toggle string
    public static String toggleString(String str) {
        char[] charArr = str.toCharArray();
        for (int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];
            if (Character.isLowerCase(ch)) {
                charArr[i] = Character.toUpperCase(ch);
            } else {
                charArr[i] = Character.toLowerCase(ch);
            }
        }

        return new String(charArr);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println(toggleString(str));

    }
}
