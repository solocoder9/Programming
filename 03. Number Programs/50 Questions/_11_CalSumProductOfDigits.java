// Calculate sum of the digits/product of the digits

import java.util.Scanner;

public class _11_CalSumProductOfDigits {

    // Method to calculate sum of digits of a number
    public static int calSum(int n) {

        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return sum;
    }

    // Method to calsulate product of digits of a number
    public static int calProd(int n) {

        int product = 1;

        while (n > 0) {
            int rem = n % 10;
            product *= rem;
            n /= 10;
        }

        return product;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Sum of digits: " + calSum(n));
        System.out.println("Product of digits: " + calProd(n));

        sc.close();
    }
}
