import java.util.Scanner;

public class PrimeNumber5 {

    // Time Complexity: O(sqrt(n)), where n is the input number
    // Space Complexity: O(1)
    // Method to check the number is prime or not (Most Optimized)
    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            // 6k ± 1, where k is a natural number
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (checkPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
