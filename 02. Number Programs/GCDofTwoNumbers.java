// Program to find the GCD(Greatest common Devisor) of two numbers
// Example - Input = 10, 15 | Output = 5

import java.util.Scanner;

public class GCDofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the value of second number: ");
        int secondNumber = sc.nextInt();

        // Using Math.min() method to find the minimum between two numbers
        int min = Math.min(firstNumber, secondNumber);
        int gcd = 0;

        // method to calculate the GCD of two numbers
        for(int i = 1; i <= min; i++) {
            if(firstNumber % i == 0 && secondNumber % i == 0) {
                gcd = i;
            }
        }

        System.out.println("GCD of " + firstNumber + ", " + secondNumber +" is: " + gcd);

        sc.close();
    }    
}
