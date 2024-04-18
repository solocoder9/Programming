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

public class Pattern19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n; i++) {
            
            // Print lest stars
            int stars = i <= n ? n - i + 1 : ((2 * i) - (2 * n)) / 2;
            for(int j = 1; j <= stars; j++) {
                System.out.print("*");
            }

            // Print spaces
            int spaces = i <= n ? 2 * i - 2 : (2 * n - i) * 2;
            for(int k = 1; k <= spaces; k++) {
                System.out.print(" ");
            }

            // Print right stars
            for(int l = 1; l <= stars; l++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }    
}
