/*
 * Examples:-
 * 
 * Input: 
 * n = 123
 * Output:
 *  1 2 3
 * 
 * Input:
 * n = 5467
 * Output:
 * 5 4 6 7 
 */

 import java.util.Scanner;

public class PrintDigits {

    // Method to print digits of a number
    static void printDigits(int n) {

        int reverse = 0;
        while (n > 0) {
            int rem = n % 10;
            reverse = ((reverse * 10) + rem);
            n /= 10;
        }

        while(reverse > 0) {
            int digits = reverse % 10;
            System.out.print(digits + " ");
            reverse /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printDigits(n);

        sc.close();
    }
}