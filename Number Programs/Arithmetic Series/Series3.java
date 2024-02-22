// -1 4 -7 10 -13 16 -19 22 -25 28

import java.util.Scanner;

public class Series3 {
    
    // Method to print arithmetic series
    static void print(int n) {
        int temp = 1;

        for(int i = 1 ; i <= n; i++) {
            if(i % 2 != 0) {
                temp = temp * (-1);
                System.out.print(temp + " ");
                temp = Math.abs(temp) + 3;
            }
            else {
                System.out.print(temp + " ");
                temp = temp + 3;
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
