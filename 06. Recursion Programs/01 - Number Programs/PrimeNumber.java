import java.util.Scanner;

public class PrimeNumber {

    // Recursive method to check whether the number is prime or not
    public static boolean isPrime(int n, int i) {

        // Base case
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        // If we've checked all factors up to sqrt(n), then it's prime
        if (i * i > n) {
            return true;
        }

        // Check divisibility by i and i+2 (6k ± 1, where k is a natural number)
        if (n % i == 0 || n % (i + 2) == 0) {
            return false;
        }


        // Recursive case: Check next potential divisors
        return isPrime(n, i + 6);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Start recursion from i = 5 (check divisibility by 5, 7, 11, 13, etc.)
        System.out.println(isPrime(n, 5) ? "Prime number" : "Not a Prime number");

        sc.close();
    }
}
