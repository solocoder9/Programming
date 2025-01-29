// Java program to check whether the number is automorphic or not

import java.util.Scanner;

public class _03_AutomorphicNumber {

    // Method to check whether the number is automorphic or not
    public static boolean checkAutomerphic(int n) {

        int square = n * n;

        while (n > 0) {
            if (n % 10 != square % 10) {
                return false;
            }
            n /= 10;
            square /= 10;
        }

        return true;

    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (checkAutomerphic(n)) {
            System.out.println(n + " is an Automorphic number");
        } else {
            System.out.println(n + " is not an Automorphic number");
        }

        sc.close();

    }
}
