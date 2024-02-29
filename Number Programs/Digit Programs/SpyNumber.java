/*
 * Example 1:- 22
 * 2+2 = 4 && 2*2 = 4
 * 
 * Example 2:- 123
 * 1+2+3 = 6 && 1*2*3 = 6
 * 
 * Example 3:- 1124
 * 1+1+2+4 = 8 && 1*1*2*8 = 8
 */

import java.util.Scanner;

public class SpyNumber {
    // Method to check the number is SpyNumber or not
    static boolean checkSpy(int n) {

        int sumOfDigits = 0;
        int productOfDigits = 1;

        while (n > 0) {
            sumOfDigits += (n % 10);
            productOfDigits *= (n % 10);
            n /= 10;
        }

        return sumOfDigits == productOfDigits;
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if(checkSpy(n)) {
            System.out.println(n + " is a spy number");
        }
        else {
            System.out.println(n + " is not a spy number");
        }

        sc.close();
    }
}
