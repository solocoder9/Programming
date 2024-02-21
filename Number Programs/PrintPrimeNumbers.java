import java.util.Scanner;

public class PrintPrimeNumbers {

    // Method to check the number is prime or not
    static boolean checkPrime(int n) {
        
        if(n <= 1) {
            return false;
        }

        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to print the prime numbers with in given range
    static void print(int range) {
        for(int i = 1; i <= range; i++) {
            if(checkPrime(i) == true) {
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
