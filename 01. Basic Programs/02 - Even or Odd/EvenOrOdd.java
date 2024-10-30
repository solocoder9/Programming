// Java program to check whether the number is even or odd

import java.util.Scanner;

public class EvenOrOdd {

    // Method to print the number is even or odd
    public static void checkNumber(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
    }
    
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        checkNumber(number);

        sc.close();
    }
}
