// Wajp to print n prime numbers
// input - n = 5
// output = 2 3 5 7 11

import java.util.Scanner;

public class _19_PrintNprimeNumbers {

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

    // Method to print n prime numbers 
    static void printPrime(int n) {

        int count = 0;
        int number = 2;

        while (count < n) {
            if(checkPrime(number)) {
                count++;
                System.out.print(number + " ");
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printPrime(n);

        sc.close();
    }
}
