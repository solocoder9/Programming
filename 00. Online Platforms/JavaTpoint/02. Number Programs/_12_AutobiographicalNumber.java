// Java program to check whether the number is Autobiographical number or not

import java.util.Scanner;

public class _12_AutobiographicalNumber {

    // Method to check whether the number is Autobiographical number or not
    public static boolean isAutobiographical(int n) {

        int digitsCount = ("" + n).length();
        int sumOfDigits = 0;

        while (n > 0) {
            sumOfDigits += (n % 10);
            n /= 10;
        }

        if (sumOfDigits > 10) {
            return false;
        }

        return sumOfDigits == digitsCount;
    }

    // Diver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isAutobiographical(n)) {
            System.out.println(n + " is an Autobiographical number");
        } else {
            System.out.println(n + " is not an Autobiographical number");
        }

        sc.close();
    }
}
