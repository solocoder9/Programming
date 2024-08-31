/*

        *
       **
      ***
     ****
    *****

 */

import java.util.Scanner;

 public class Pattern05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the valud of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // For printing spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // For printing stars
            for(int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }    
}
