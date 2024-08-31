/*
 *      Ex:-   Number = 12345
 * 
 * Example 1: - Rotate the number by 1
 * Output: 51234
 * 
 * Example 2: - Rotate the number by 2
 * Output: 54123
 * 
 * Example 3: - Rotate the number by -2 
 * Ouptut: 34512
 */

import java.util.Scanner;

public class RotateNumber2 {
    
    // Method to rotate a number
    static int rotateNumber(int n, int rotBy) {
        
        int temp = n;
        int totalDigits = 0;

        while (temp > 0) {
            temp /= 10;
            totalDigits++;
        }

        // For +ve number (rotate)
        rotBy = rotBy % totalDigits; 
        // For -ve number (rotate)
        if(rotBy < 0) {
            rotBy = rotBy + totalDigits;
        }

        int div = 1;
        int mul = 1;

        for (int i = 1; i <= totalDigits; i++) {
            if(i <= rotBy) {
                div = div * 10;
            }
            else {
                mul = mul * 10;
            }
        }

        int rem = n % div;
        n = n / div;

        int rotateNumber = (rem * mul) + n;


        return rotateNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of rotate: ");
        int rotBy = sc.nextInt();

        System.out.println(rotateNumber(n, rotBy));

        sc.close();
    }
}
