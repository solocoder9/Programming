/*

    *********
     *******
      *****
       ***
        *

 */

import java.util.Scanner;

public class Pattern08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the valud of n: ");
        int n = sc.nextInt();

        for(int i = n; i >= 1; i--) {

            // Printing spaces
            for(int j = 1; j <= n-i; j++) {
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
