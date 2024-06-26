// count no of digits in a given number

import java.util.Scanner;

public class _08_CountDigits {
    
    // Method to count the numer of digits a number
    public static int countDigits(int n) {
        
        int countDigits = 0;

        while (n > 0) {
            n /= 10;
            countDigits++;
        }

        return countDigits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        
        System.out.println(countDigits(n));

        sc.close();
    }
}
