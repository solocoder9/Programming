import java.util.Scanner;

public class PrintFirstNprimeNumber {
    
    // Time Complexity: O(n * sqrt(n)), where n is the number of primes to print
    // Space Complexity: O(1)

    // Method to check if the number is prime or not
    // Time Complexity: O(sqrt(n)), where n is the input number
    // Space Complexity: O(1)
    static boolean checkPrime(int n) {
        if (n <= 1) {
            return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
    
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
    
        return true;
    }

    // Method to print first N prime numbers
    // Time Complexity: O(n * sqrt(n)), where n is the number of primes to print
    // Space Complexity: O(1)
    static void printPrime(int n) {

        int count = 0;
        int number = 2;

        while(count < n) {
            if(checkPrime(number)) {
                count++;
                System.out.print(number + " ");
            }
            number++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printPrime(n);

        sc.close();
    }
}
