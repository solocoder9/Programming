// Program to check the number is Armstrong or not
// Example - 1, 2, 3 
// 153 = 1^3 + 5^3 + 3^3 = 3 + 125 + 27 = 153
// 1634 = 1^4 + 6^4 + 3^4 + 4^4 = 1 + 1296 + 81 + 256 = 1643

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
    
        // Input
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        int temp = number;
        int count = 0;

        // Count the number digits
        while(temp > 0) {
            temp = temp / 10;
            count++;                
        }

        temp = number; // Reset temp to the original number
        int sum = 0;

        while(temp > 0) {
            int digit = temp % 10;
            int digitPower = 1;

            // Calculate the power of the digit
            for(int i = 1; i <= count; i++) {
                digitPower *= digit;
            }

            sum += digitPower;
            temp /= 10;
        }

        if(sum == number) {
            System.out.println(number + " is an Armstrong number");
        }
        else {
            System.out.println(number + " is not an Armstrong number");
        }

        sc.close();
    }
}
