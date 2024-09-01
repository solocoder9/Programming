// Java program to check whether the number is a Strontio number or not

import java.util.Scanner;

public class _23_StrontioNumber {

    // Method to check whether the number Strontio number or not
    public static boolean isStrontio(int n) {

        if ((n + "").length() != 4) {
            return false;
        }

        String str = String.valueOf(n * 2);

        return str.charAt(str.length() - 3) == str.charAt(str.length() - 2);

    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        // Display whether the number is Strontio number or not
        if (isStrontio(n)) {
            System.out.println(n + " is a Strontio number");
        } else {
            System.out.println(n + " is not Strontio number");
        }

        sc.close();
    }
}
