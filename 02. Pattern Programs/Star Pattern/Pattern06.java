/*

    *****
     ****
      ***
       **
        *

 */

import java.util.Scanner;

public class Pattern06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // For printing spaces
            for(int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }

            // For printing stars
            for(int k = 0; k <= n - i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }    
}
