/*

    ABCDE
    ABCD
    ABC
    AB
    A
    
 */

import java.util.Scanner;

public class CharPattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = n; i > 0; i--){

            for(char j = 'A'; j <= 'A' + i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }

        sc.close();
    }    
}
