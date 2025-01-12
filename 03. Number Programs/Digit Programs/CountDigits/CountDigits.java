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
    public static int countDigits(int n) {

        int countDigit = 0;

        while (n > 0) {
            n /= 10;
            countDigit++;
        }

        return countDigit;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Number of digits is: " + countDigits(n));
        
        sc.close();
    }
}
