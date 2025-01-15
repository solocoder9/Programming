import java.util.Scanner;

public class PrintNumsFrom1toN {

    // Recursive method to print numbers from 1 to n
    public static void printNumbers(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Recursive case
        printNumbers(n - 1);

        // Print the current number
        System.out.print(n + " ");
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printNumbers(n);

        sc.close();
    }
}
