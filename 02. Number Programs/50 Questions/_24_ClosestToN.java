/*
 * Given non-zero two integers N and M. The problem is to find the 
 * number closest to N and divisible by M. If there are more than
 * ont such number then output the one haveing maximum absolute value.
 * Input:
 * N = 13 , M = 4
 * Output:
 * 12
 * Explanation:
 * 12 is the Closest Number to
 * 13 which is divisible by 4.
 */

import java.util.Scanner;

public class _24_ClosestToN {
    
    // Method to find out closest
    public static int findClosest(int N, int M) {

        if(N <= 0 || M <= 0) {
            System.out.print("Invalid input");
        }

        int i;
        for(i = N; i >= 1; i--) {
            if (i % M == 0) {
                break;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.print("Enter the value of M: ");
        int M = sc.nextInt();

        System.out.println(findClosest(N, M));

        sc.close();
    }
}
