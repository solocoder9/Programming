// 1 4 9 16 25 36 49 64 81 100

import java.util.Scanner;

public class SquareSeries {
    
    // Method to print Square Series
    static void squareSeries(int n) {
        
        for(int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        squareSeries(n);

        sc.close();
    }
}
