/*
 * Examples:
 * 
 * Input:
 * n = 123
 * Output:
 * 321
 * 
 * Input: 
 * n = 4681
 * Output:
 * 1864
 */

import java.util.Scanner;

public class ReverseNumber {
    
    // Method to print reverse of number
    static void printReverse(int number) {

        while (number > 0) {
            int rem = number % 10;
            System.out.print(rem);
            number /= 10;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        printReverse(number);

        sc.close();
    }
}
