// Program to find the LCM(Least Common multiple) of two numbers
// Example - Input = 10, 15 | Output = 30
// Example2 - Input = 4, 8 | Output = 8

import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the value of secondNumber: ");
        int secondNumber = sc.nextInt();
        
        // Using Math.mas() method to find the maximum between two numbers
        int maxNumber = Math.max(firstNumber, secondNumber);
        int product = firstNumber * secondNumber;
        int lcm = 0;

        // Method to calculate the LCM of two numbers
        for(int i = maxNumber; i <= product; i++) {
            if(i % firstNumber == 0 && i % secondNumber == 0) {
                lcm = i;
                break;
            }
        }

        System.out.println("LCM of " + firstNumber + ", " + secondNumber + " is: " + lcm);

        sc.close();
    }    
}
