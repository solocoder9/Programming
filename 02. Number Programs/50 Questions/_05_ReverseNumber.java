// revese a given number

import java.util.Scanner;

public class _05_ReverseNumber {
    
    // Method to reverse a number
    static int reverseNumber(int n) {
        
        int reverseNumber = 0;

        while (n > 0) {
            int rem = n % 10;
            reverseNumber = (reverseNumber * 10) + rem;
            n /= 10;
        }

        return reverseNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.println(reverseNumber(n));

        sc.close();
    }
}
