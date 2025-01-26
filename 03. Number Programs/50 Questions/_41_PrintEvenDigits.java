import java.util.Scanner;

public class _41_PrintEvenDigits {

    // Method to print even digits of a number
    public static void printEvenDigits(int n) {

        // Reverse the number to print forward order
        int temp = n, reverse = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;
            reverse = (reverse * 10) + lastDigit;
            temp /= 10;
        }

        while (reverse > 0) {
            int digit = reverse % 10;
            if (digit % 2 == 0) {
                System.out.print(digit + " ");
            }
            reverse /= 10;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printEvenDigits(n);

        sc.close();
    }
}
