import java.util.Scanner;

public class ProductOfDigits {

    // Recursive method to find the product of digits of a number
    public static int productOfDigits(int n) {

        // Base case: If n is 0, return 1 (since there are no more digits)
        if (n == 0) {
            return 1;
        }

        // Recursive case: Multiply the last digit with the result of product of the remaining digits
        return (n % 10) * productOfDigits(n / 10);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Handle the special case where the number is 0
        if (n == 0) {
            System.out.println("The product of digits is: 0");
        } else {
            System.out.println("The product of digits is: " + productOfDigits(n));
        }

        sc.close();
    }
}
