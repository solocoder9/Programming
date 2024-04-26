import java.util.Scanner;

public class PrimeNumber6 {
    
    // Time Complexity: O(n log log n), where n is the input number
    // Space Complexity: O(n), where n is the input number
    // Method to check if the number is prime or not using Sieve of Eratosthenes
    static boolean isPrime(int n) {
        // If number is less than 2, it's not prime
        if (n < 2) {
            return false;
        }
        // Create an array to mark composites
        boolean[] isComposite = new boolean[n + 1];
        // Mark composites starting from 2
        for (int i = 2; i * i <= n; i++) {
            if (!isComposite[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isComposite[j] = true;
                }
            }
        }
        // If n is not marked as composite, it's prime
        return !isComposite[n];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }

        sc.close();
    }
}
