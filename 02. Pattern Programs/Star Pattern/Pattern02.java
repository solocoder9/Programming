/*

    *
    **
    ***
    ****
    *****

 */

import java.util.Scanner;

public class Pattern02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Outer loop for rows
        for(int i = 1; i <= n; i++) {

            // Inner loop for columns
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        sc.close();
    }
}
