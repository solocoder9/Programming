// 1 4 7 10 13 16 19 22 25 28

import java.util.Scanner;

public class Series1 {

    // Method to print arithmetic series 
    static void arithmetic(int n) {
        int temp  = 1;;

        for(int i = 1; i <= n; i++) {
            System.out.print(temp + " ");
            temp += 3;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        arithmetic(n);

        sc.close();
    }
    
}
