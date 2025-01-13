import java.util.Scanner;

public class CountDigits {

    // Recursive method to count digits of a number
    public static int countDigits(int n) {

        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case: remove one digit and count the remaining digits
        return 1 + countDigits(n / 10);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Handle edge case where input is 0
        if (n == 0) {
            System.out.println("The number of digits is: 1");
        } else {
            System.out.println("The number of digits is: " + countDigits(n));
        }

        sc.close();
    }
}
