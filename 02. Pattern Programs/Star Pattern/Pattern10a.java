/*

        *
       ***
      *****
     *******
    *********
    *********
     *******
      *****
       ***
        *

 */

import java.util.Scanner;

public class Pattern10a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Printing upper part
        for(int i = 1; i <= n; i++) {
            
            // Printing spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        // Printing lower part
        for(int i = n; i >= 1; i--) {

            // Printing spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }    
}
