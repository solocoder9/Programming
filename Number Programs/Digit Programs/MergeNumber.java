/*
 * Examples:-
 * 
 * Input:
 * n1 = 124, n2 = 78
 * Output:
 * 12478
 * 
 * Input:
 * n1 = 45, n2 = 83
 * Output:
 * 4583
 */

import java.util.Scanner;

public class MergeNumber {
    
    // Mehtod to merge two numbers
    static int mergeNumber(int n1, int n2) {

        int temp = n2;

        while (temp > 0) {
            n1 *= 10;
            temp /= 10;
        }

        return n1 + n2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n1: ");
        int n1 = sc.nextInt();

        System.out.print("Enter the value of n2: ");
        int n2 = sc.nextInt();

        System.out.println(mergeNumber(n1, n2));

        sc.close();
    }
}
