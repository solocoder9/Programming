/*

    *       *
    **     **
    ***   ***
    **** ****
    *********
    **** ****
    ***   ***
    **     **
    *       *
    
 */

import java.util.Scanner;

public class Pattern20a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int lstars = 1;
        int rstars = 2 * n - 1;
        
        // Outer loop
        for(int i = 1; i <= 2 * n - 1; i++) {

            // Inner loop
            for(int j = 1; j <= 2 * n - 1; j++) {

                // Print stars & spaces
                if(j <= lstars || j >= rstars) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

            System.out.println();

            if(i < n) {
                lstars++;
                rstars--;
            }
            else {
                lstars--;
                rstars++;
            }
        }

        sc.close();
    }    
}


