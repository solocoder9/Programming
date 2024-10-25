/*

    A
    AB
    ABC
    ABCD
    ABCDE 
    
 */

import java.util.Scanner;

public class CharPattern1a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int letter = 65; // ASCII value of A is 65

        for(int i = 0; i < n; i++) {
            
            for(int j = 0; j <= i; j++) {
                System.out.print((char) (letter + j));
            }

            System.out.println();
        }

        sc.close();
    }    
}
