/*

        A
       ABA
      ABCBA  
     ABCDCBA
    ABCDEDCBA 
    
 */

import java.util.Scanner;

public class CharPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++) {

            // Print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print alphabates
            char ch = 'A';
            int breakpoint = ((2 * i - 1)/2);
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch);
                if(k <= breakpoint) {
                    ch++;
                }
                else {
                    ch--;
                }
            }

            System.out.println();
        }

        sc.close();
    }    
}
