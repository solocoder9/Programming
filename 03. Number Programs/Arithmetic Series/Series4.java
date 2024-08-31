// 10 5 60 15 110 25 160 35 210 45 

import java.util.Scanner;

public class Series4 {
    
    // Method to print arithmetic series
    static void print(int n) {
        int a = 10;
        int b = 5;
        for(int i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.print(a + " ");
                a += 50;
            }
            else {
                System.out.print(b + " ");
                b += 10;
            }
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
