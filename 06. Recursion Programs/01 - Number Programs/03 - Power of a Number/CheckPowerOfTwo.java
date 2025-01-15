import java.util.Scanner;

public class CheckPowerOfTwo {

    // Recursive method to check if the number is a power of 2
    public static boolean isPowerOfTwo(int n) {

        // Base case
        if (n <= 0) {
            return false;
        } else if (n == 1) {
            return true;
        }

        // Recursive case22
        if (n % 2 == 0) {
            return (isPowerOfTwo(n / 2));
        } else {
            return false;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (isPowerOfTwo(n)) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }

        sc.close();
    }
}
