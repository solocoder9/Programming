/*
 * Examples:-
 * 
 * Input: 
 * n = 123
 * Output:
 * 2
 * 
 * Input:
 * n = 16342
 * Output:
 * 6 4 2
 */

import java.util.Scanner;

public class PrintEvenDigits {
    
    // Method to print evev digits of a number
    static void printEvenDigits(int n) {

        while (n > 0) {
            int rem = n % 10;
            if(rem % 2 == 0) {
                System.out.print(rem + " ");
            }
            n /= 10;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printEvenDigits(n);

        sc.close();
    }
}
