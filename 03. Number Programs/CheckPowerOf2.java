// Java program to check whether the number is power of two or not

import java.util.Scanner;

public class CheckPowerOf2 {

    // Method to check whether the number is a power of 2 or not
    public static boolean isPower2(int n) {
        if (n <= 0) {
            return false;
        }

        return (n & (n - 1)) == 0;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (isPower2(n)) {
            System.out.println(n + " is a power of 2");
        } else {
            System.out.println(n + " is not a power of 2");
        }

        sc.close();
    }
}
