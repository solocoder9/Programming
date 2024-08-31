/*

    E
    DE
    CDE
    BCDE
    ABCDE 
    
 */

import java.util.Scanner;

public class CharPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int alphabates = 65; // ASCII of A
        for(int i = n; i >= 1; i--) {
            for(int j = i; j <= n; j++) {
                System.out.print((char)(alphabates + j - 1));
            }

            System.out.println();
        }

        sc.close();
    }    
}
