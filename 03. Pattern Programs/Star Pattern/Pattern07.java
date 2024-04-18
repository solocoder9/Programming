/*

        *
       ***
      *****
     *******
    *********

 */

import java.util.Scanner;

public class Pattern07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {
            
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
