/*

    A
    BB
    CCC
    DDDD
    EEEEE
    
 */

import java.util.Scanner;

public class CharPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int letter = 65; // ASCII of A
        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j <= i; j++) {
                System.out.print((char)(letter + i));
            }

            System.out.println();
        }

        sc.close();
    }    
}
