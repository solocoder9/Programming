// Print n even numbers

import java.util.Scanner;

public class _16_PrintNevenNumbers {
    
    // Method to print n even numbers
    public static void printNeven(int n) {

        int even = 2; 

        for (int i = 1; i <= n; i++) {
            System.out.print(even + " ");
            even += 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printNeven(n);

        sc.close();
    }
}
