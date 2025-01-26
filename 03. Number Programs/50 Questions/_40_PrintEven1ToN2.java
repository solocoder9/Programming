import java.util.Scanner;

public class _40_PrintEven1ToN2 {

    // Recursive method to print even number from 1 to n
    public static void printEven(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        // Recursive case
        printEven(n - 1);

        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printEven(n);

        sc.close();
    }
}
