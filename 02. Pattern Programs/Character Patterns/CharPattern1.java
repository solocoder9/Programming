/*

    A
    AB
    ABC
    ABCD
    ABCDE 
    
 */

import java.util.Scanner;

public class CharPattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            
            for(char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch);
            }

            System.out.println();
        }

        sc.close();
    }    
}
