// Java program to check whether the number is Buzz number or not

import java.util.Scanner;

public class _15_BuzzNumber {

    // Method to check whether the number is Buzz number or not
    public static boolean isBuzz(int n) {

        return n % 7 == 0 || n % 10 == 7;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number to check: ");
        int n = sc.nextInt();

        if (isBuzz(n)) {
            System.out.println(n + " is a Buzz number");
        } else {
            System.out.println(n + " is not a Buzz number");
        }

        sc.close();
    }
}
