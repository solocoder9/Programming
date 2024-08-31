/*

    A
    AB
    ABC
    ABCD
    ABCDE 
    
 */

import java.util.Scanner;

public class CharPattern1b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of ch: ");
        char ch = sc.next().charAt(0);

        for(char i = 'A'; i <= ch; i++) {

            for(char j = 'A'; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }    
}
