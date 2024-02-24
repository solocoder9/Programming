// 1 5 10 16 23 31 40 50 61 73 86

import java.util.Scanner;

public class Series5 {
    
    static void printSeries(int n) {
        int temp = 1;
        
        for(int i = 0; i <= n; i++) {
            System.out.print(temp + " ");
            temp = temp+4+i;
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
