/*

    *        *
    **      **
    * *    * *
    *  *  *  *
    *   **   *
    *   **   *
    *  *  *  *
    * *    * *
    **      **
    *        *
    
 */

import java.util.Scanner;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the valud of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= 2 * n; i++) {
            for(int j = 1; j <= 2 * n; j++) {
                if(j == 1 || j == 2 * n || j == i || j + i == 2 * n + 1) {
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
