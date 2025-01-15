import java.util.Scanner;

public class PrintNumsFromNto1 {

    // Recursive method to print numbers from n to 1
    public static void printNumbers(int n) {

        // Base case
        if (n == 0) {
            return;
        }

        // Print the current number
        System.out.print(n + " ");

        // Recursive case
        printNumbers(n - 1);
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
