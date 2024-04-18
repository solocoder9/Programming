/*

    **********
    ****  ****
    ***    ***
    **      **
    *        *
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    
 */

import java.util.Scanner;

public class Pattern19a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n:");
        int n = sc.nextInt();

        // Print upper part
        for(int i = 1; i <= n; i++) {
            
            // Print left stars
            for(int j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            // Print spaces
            for(int k = 1; k <= 2 * i - 2; k++) {
                System.out.print(" ");
            }

            // Print right stars
            for(int l = 1; l <= n - i + 1; l++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // Print lower part
        for(int i = 1; i <= n; i++) {
            
            // Print left stars
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Print spaces
            for(int k = 1; k <= (2 * n) - (2 * i); k++) {
                System.out.print(" ");
            }

            // Print right stars
            for(int l = 1; l <= i; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }    
}
