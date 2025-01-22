import java.util.Scanner;

public class _26_LargestJumpingNumber {

    // Method to find the largest jumping number
    public static int largestJumpingNumber(int n) {
        for (int i = n; i >= 1; i--) {
            if (isJumping(i)) {
                return i;
            }
        }

        return -1;
    }

    // Helper method to check whether the number is Jumping number or not
    public static boolean isJumping(int n) {
        int lastDigit = n % 10;
        n = n / 10;

        while (n > 0) {
            int rem = n % 10;
            if (Math.abs(lastDigit - rem) != 1) {
                return false;
            } else {
                lastDigit = rem;
            }
            n /= 10;
        }

        return true;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of X: ");
        int X = sc.nextInt();

        System.out.println(largestJumpingNumber(X));

        sc.close();
    }
}
