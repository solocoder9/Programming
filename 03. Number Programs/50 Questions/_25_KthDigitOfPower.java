import java.util.Scanner;

public class _25_KthDigitOfPower {

    // Method to find the Kth digit from right of A^B
    public static int kThDigit(int A, int B, int K) {

        int power = (int) Math.pow(A, B);
        int numberOfDigits = (int) Math.log1p(power) + 1;

        if (K > numberOfDigits) {
            return -1;
        }

        for (int i = 1; i < K; i++) {
            power /= 10;
        }

        return power % 10;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of A: ");
        int A = sc.nextInt();
        System.out.print("Enter the value of B: ");
        int B = sc.nextInt();
        System.out.print("Enter the value of K: ");
        int K = sc.nextInt();

        System.out.println("Kth digit is: " + kThDigit(A, B, K));

        sc.close();
    }
}
