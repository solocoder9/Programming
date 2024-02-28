/*
 * Examples:-
 * 
 * Input: 
 * n = 123
 * Output:
 * 1
 * 
 * Input:
 * n = 16342
 * Output:
 * 3
 */

import java.util.Scanner;

public class CountEvenDigits {
    
    // Method to count evev digits of a number
    static void countEvenDigits(int n) {

        int countEven = 0;

        while (n > 0) {
            int rem = n % 10;
            if(rem % 2 == 0) {
                countEven++;
            }
            n /= 10;
        }

        System.out.println("Even digits: " + countEven);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        countEvenDigits(n);

        sc.close();
    }
}
