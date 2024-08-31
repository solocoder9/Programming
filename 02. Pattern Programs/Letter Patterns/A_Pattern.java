/*

        *
       * *
      *****
     *     *
    *       *

 */

import java.util.Scanner;

public class A_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // Pirnt spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print stars
            for(int k = 1; k <= 2* i - 1; k++) {
                if(k == 1 || k == 2 * i - 1 || i == (n+1) / 2) {
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
