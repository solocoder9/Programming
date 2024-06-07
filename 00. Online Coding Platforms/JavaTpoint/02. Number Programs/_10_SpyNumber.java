// Java program to check whether the number is Spy number or not

import java.util.Scanner;

public class _10_SpyNumber {

    // Method to check whether the number is Spy number or not
    public static boolean isSpy(int n) {

        if (n < 0) {
            return false;
        }

        int sum = 0;
        int product = 1;

        while (n > 0) {
            sum += (n % 10);
            product *= (n % 10);
            n /= 10;
        }

        return sum == product;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isSpy(n)) {
            System.out.println(n + " is a Spy number");
        } else {
            System.out.println(n + " is not a Spy number");
        }

        sc.close();
    }
}
