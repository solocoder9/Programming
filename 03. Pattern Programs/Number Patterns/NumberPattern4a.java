/*

    1
    01
    101
    0101
    10101
    
 */

import java.util.Scanner;

public class NumberPattern4a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // Initialize the starting value 
            int start = i % 2 == 0 ? 0 : 1;

            for(int j = 1; j <= i; j++) {
                System.out.print(start);

                // Flip 0 and 1
                start = 1 - start;
            }

            System.out.println();
        }

        sc.close();
    }    
}
