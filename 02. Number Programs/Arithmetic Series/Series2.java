// 2 15 41 80 132 197 275

import java.util.Scanner;

public class Series2 {
    
    // Method to print arithmetic series
    static void print(int n) {

        int a = 2;
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = (13 * i) + a;
            a = c;
            
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        print(n);

        sc.close();
    }
}
