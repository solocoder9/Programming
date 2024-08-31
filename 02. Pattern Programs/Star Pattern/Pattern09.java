/*

        *
       ***
      *****
     *******
    *********
     *******
      *****
       ***
        *

 */

import java.util.Scanner;

public class Pattern09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n - 1; i++) {

            // For printing spaces
            int spaces = i <= n ? n - i : i - n;
            for(int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // For printing stars
            int stars = i <= n ? 2 * i - 1 : 2 * ( 2 * n - i) -1;
            for(int k = 1; k <= stars; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }    
}
