// Java program to check whether the number is Duck number or not

import java.util.Scanner;

public class _16_DuckNumber {

    // Method to check whether the number is Duck number or not
    public static boolean isDuck(String n) {

        String str = "" + n;

        if (str.charAt(0) == '0') {
            return false;
        }

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == '0') {
                return true;
            }
        }

        return false;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        String n = sc.nextLine();

        if (isDuck(n)) {
            System.out.println(n + " is a Duck number");
        } else {
            System.out.println(n + " is not a Duck number");
        }

        sc.close();
    }
}
