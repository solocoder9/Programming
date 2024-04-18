/*

        *
       * *
      *   *
     *     *
    *       *
     *     *
      *   *
       * *
        *   
    
 */

import java.util.Scanner;

public class Pattern16a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Print upper part
        for(int i = 1; i <= n; i++) {
            
            // Print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for(int k = 1; k <= 2 * i - 1; k++) {
                if(k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        // Print lower part
        for(int i = n - 1; i >= 1; i--) {
            
            // Print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars and spaces
            for(int k = 1; k <= 2 * i - 1; k++) {
                if(k == 1 || k == 2 * i - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }

        sc.close();
    }    
}
