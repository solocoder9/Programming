// 1 10 2 20 4 40 8 80 16 160

import java.util.Scanner;

public class Series6 {
    
    static void printSeries(int n) {
        int a = 1;
        int b = 10;
        
        for(int i = 1; i <= n; i++) {
            
            if(i%2 == 0) {
                System.out.print(b + " ");
                b = b * 2;
            }
            else {
                System.out.print(a + " ");
                a = a * 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printSeries(n);

        sc.close();
    }
}
