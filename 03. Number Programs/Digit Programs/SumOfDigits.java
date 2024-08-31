/*
 * Examples:-
 * 
 * Input: 
 * n = 123
 * Output:
 * 6
 * 
 * Input:
 * n = 546
 * Output:
 * 15 
 */

 import java.util.Scanner;

public class SumOfDigits {

    // Method to calculate the sum of digits
    static int calSumOfDigits(int n) {

        int sumOfDigits = 0;

        while (n > 0) {
            sumOfDigits += (n % 10);
            n /= 10;
        }

        return sumOfDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println(calSumOfDigits(n));

        sc.close();
    }
}