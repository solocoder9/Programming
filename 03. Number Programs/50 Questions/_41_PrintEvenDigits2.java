import java.util.Scanner;

public class _41_PrintEvenDigits2 {

    // Recursive method to print even digits of a number
    public static void printEvenDigits(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive case
        printEvenDigits(n / 10);

        int digit = n % 10;
        if (digit % 2 == 0) {
            System.out.print(digit + " ");
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
