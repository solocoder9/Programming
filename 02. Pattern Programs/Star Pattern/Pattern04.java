/*

    *
    **
    ***
    ****
    *****
    ****
    ***
    **
    *

 */

import java.util.Scanner;

public class Pattern04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2*n-1; i++) {
            
            // If i is less than or equal to n, it prints i stars
            // Otherwise, it prints (2 * n - i) stars
            int stars = i <= n ? i : n * 2 - i;

            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        sc.close();
    }
}
