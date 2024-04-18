/*

    *****
    *****
    *****
    *****
    *****
    
 */

import java.util.Scanner;

public class Pattern01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Outer loops for rows
        for(int i = 1; i <= n; i++) {

            // Inner loops for colums
            for(int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        sc.close();
    }
}
