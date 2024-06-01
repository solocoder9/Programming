import java.util.Scanner;

public class EvenFibonacciSeries {

    // Method to print even fibonacci numbers
    public static void evenFibonacci(int n) {

        int a = 0;
        int b = 1;
        int c;
        int count = 1;

        while (count <= n) {
            if (a % 2 == 0 && a != 0) {
                System.out.print(a + " ");
                count++;
            }
            c = a + b;
            a = b;
            b = c;

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        evenFibonacci(n);

        sc.close();
    }
}
