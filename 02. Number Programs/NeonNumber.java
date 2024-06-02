// Java program to check whether the number is Neon number of not

import java.util.Scanner;

public class NeonNumber {

    // Method to check whether the number is Neon number or not
    public static boolean isNeon(int n) {

        int squre = n * n;
        int sumOfdigits = 0;

        while (squre > 0) {
            int rem = squre % 10;
            sumOfdigits += rem;
            squre /= 10;
        }

        return n == sumOfdigits;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isNeon(n)) {
            System.out.println(n + " is a Neon number");
        } else {
            System.out.println(n + " is not a Neon number");
        }

        sc.close();
    }
}
