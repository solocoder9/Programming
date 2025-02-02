import java.util.Scanner;

public class SumDigits {
    public static int sumDigits(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        return (n % 10) + sumDigits(n / 10);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.print(sumDigits(n));

        sc.close();
    }
}
