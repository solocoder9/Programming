import java.util.Scanner;

public class PrintPrimeNumbers {

    // Time Complexity: O(n * sqrt(n)), where n is the value of the range
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

    // Method to print the prime numbers within the given range
    // Time Complexity: O(n * sqrt(n)), where n is the value of the range
    // Space Complexity: O(1)
    static void print(int range) {
        for(int i = 1; i <= range; i++) {
            if(checkPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int range = sc.nextInt();

        print(range);

        sc.close();
    }
}
