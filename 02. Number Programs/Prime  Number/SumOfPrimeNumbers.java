import java.util.Scanner;

public class SumOfPrimeNumbers {

    // Time Complexity: O(n * sqrt(n)), where n is the value of the range
    // Space Complexity: O(1)

    /// Method to check if the number is prime or not
    // Time Complexity: O(sqrt(n)), where n is the input number
    // Space Complexity: O(1)
    public static boolean checkPrime(int n) {
        
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to calculate sum of prime numbers in a given range
    // Time Complexity: O(n * sqrt(n)), where n is the value of the range
    // Space Complexity: O(1)
    static int sumOfPrimeNumbers(int range) {

        int sumOfPrimes = 0;

        for (int i = 2; i <= range; i++) {
            if (checkPrime(i)) {
                sumOfPrimes += i;
            }
        }

        return sumOfPrimes;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        System.out.println("Sum of Prime numbers is: " + sumOfPrimeNumbers(range));

        sc.close();
    }
}
