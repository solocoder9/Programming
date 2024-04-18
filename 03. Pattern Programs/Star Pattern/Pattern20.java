/*

    *       *
    **     **
    ***   ***
    **** ****
    *********
    **** ****
    ***   ***
    **     **
    *       *
    
 */

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n - 1; i++) {

            // Print left stars
            int stars = i <= n ? i : 2 * n - i;
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces
            int spaces = i <= n ? (2 * n - 1) - (2 * i) : 2 * (n - stars) - 1;
            for(int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Print right stars
            int rstars = i == n ? (2 * n - 1) - (stars + spaces) - 1 : (2 * n - 1) - (stars + spaces);
            for(int l = 1; l <= rstars; l++) {
                System.out.print("*");
            }


            System.out.println();
        }

        sc.close();
    }
}
