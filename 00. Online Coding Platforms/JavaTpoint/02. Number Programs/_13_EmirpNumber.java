// Java program to check whether the number is Emirp number or not

import java.util.Scanner;

public class _13_EmirpNumber {

    // Method to check whether the number is prime number or not
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to check whether the number is Emirp number or not
    public static boolean isEmirp(int n) {

        if (!isPrime(n)) {
            return false;
        }

        int revNumber = 0;

        while (n > 0) {
            int rem = n % 10;
            revNumber = (revNumber * 10) + rem;
            n /= 10;
        }

        return isPrime(revNumber);

    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isEmirp(n)) {
            System.out.println(n + " is a Emirp number");
        } else {
            System.out.println(n + " is not a Emirp number");
        }

        sc.close();
    }
}
