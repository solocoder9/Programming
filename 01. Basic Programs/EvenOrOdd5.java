// Java program to check whether the number is even or odd

import java.util.Scanner;

public class EvenOrOdd5 {

    // Method to check whether the number is even or odd
    // using right shift operator
    public static boolean checkEvenOrOdd(int n) {
        return (n >> 1) << 1 == 0;
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
