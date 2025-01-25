import java.util.Scanner;

public class _35_FirstNOddFibonacci {

    // Method to print first n odd fibonacci numbers
    public static void printOddFibonacci(int n) {
        int a = 0, b = 1;

        while (n >= 1) {
            if (b % 2 != 0) {
                System.out.print(b + " ");
                n--;
            }
            int c = a + b;
            a = b;
            b = c;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printOddFibonacci(n);

        sc.close();
    }
}
