/*

    ****
    *   *
    ****
    *   *
    ****
    
 */

import java.util.Scanner;

public class B_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            int limit = (i == 1 || i == n || i == (n+1)/2) ? n - 1 : n;

            for(int j = 1; j <= limit; j++) {
                if(j == 1 || j == limit || i == 1 || i == n || i == (n+1)/2) {
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
