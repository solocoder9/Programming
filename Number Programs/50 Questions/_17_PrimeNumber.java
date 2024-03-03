// Check given number is prime numer or not

import java.util.Scanner;

public class _17_PrimeNumber {
    
    // Method to check if the number is prime or not
    static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if(n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i +=6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (checkPrime(n)) {
            System.out.println("Prime number");
        }
        else {
            System.out.println("Not a prime number");
        }

        sc.close();
    }
}
