// Java program to check whether the given number is even or odd

import java.util.Scanner;

public class EvenOrOdd2 {

    // Method to check whether the number is even or odd using '%' operator
    public static boolean checkEvenOrOdd(int n) {
        return (n % 2) == 0;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (checkEvenOrOdd(n)) {
            System.out.println(n + " is an even number");
        } else {
            System.out.println(n + " is an odd number");
        }

        sc.close();
    }    
}
