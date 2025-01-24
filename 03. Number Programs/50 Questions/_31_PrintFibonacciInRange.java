import java.util.Scanner;

public class _31_PrintFibonacciInRange {

    // Method to print fibonacci numbers in a given range
    public static void printFibonacci(int range) {
        int a = 0;
        int b = 1;

        while (b <= range) {
            System.out.print(b + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        printFibonacci(range);

        sc.close();
    }
}
