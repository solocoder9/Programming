// Wajp to print Nth prime number

import java.util.Scanner;

public class _20_PrintNthPrimeNumber {
    
    // Method to check if the number is prime or not
    public static boolean checkPrime(int n) {

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

    // Method to print nth prime number
    static void printNthPrime(int n) {

        int count = 0;
        int number = 2; 

        while (count < n) {
            if(checkPrime(number)) {
                count++;
                if(count == n) {
                    System.out.println(number);
                }
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printNthPrime(n);

        sc.close();
    }
}
