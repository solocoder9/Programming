import java.util.Scanner;

public class _32_FirstNEvenFibonacci {

    // Method to print first n even fibonacci numbers
    public static void firstNEvenFibonacci(int n) {

        int a = 0;
        int b = 1;

        while (n >= 1) {
            if (b % 2 == 0) {
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

        firstNEvenFibonacci(n);

        sc.close();
    }
}
