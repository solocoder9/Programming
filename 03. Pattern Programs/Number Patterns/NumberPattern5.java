/*

    1        1
    12      21
    123    321
    1234  4321
    1234554321
    
 */

import java.util.Scanner;


public class NumberPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // Print left numbers
            for(int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            // Print spaces
            for(int k = 1; k <= 2 * n - (i + i); k++) {
                System.out.print(" ");
            }

            // Print right numbers(reverse)
            for(int l = i; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }

        sc.close();
    }    
}
