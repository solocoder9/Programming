import java.util.Scanner;

public class Factorial {

    public static int factorial(int n) {
        // Base case
        if (n <= 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println(factorial(n));

        sc.close();
    }
}
