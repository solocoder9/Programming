import java.util.Scanner;

public class _45_SeparateEvenOddDigits {

    // Method to separate even and odd digit in a number
    public static void separateDigits(int n) {
        System.out.print("Even digits: ");
        int temp = n;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            n /= 10;
        }
        System.out.print("\nOdd digits: ");
        while (temp > 0) {
            int digit = temp % 10;
            if (digit % 2 != 0) {
                System.out.print(digit + " ");
            }
            temp /= 10;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        separateDigits(n);

        sc.close();
    }
}
