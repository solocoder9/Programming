/*
 * Examples:-
 * 
 * Input: 
 * n = 123
 * Output:
 * 3
 * 
 * Input:
 * n = 13457
 * Output:
 * 5
 */

import java.util.Scanner;

public class CountDigits {
    
    // Method to count digits of a number
    static void countDigits(int n) {

        int count = 0;

        while (n > 0) {
            n /= 10;
            count++;
        }

        System.out.println("Digits: " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        countDigits(n);

        sc.close();
    }
}
