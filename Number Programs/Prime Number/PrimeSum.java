import java.util.Scanner;

public class PrimeSum {
    
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

    // Method to calculate & print the sum of prime numbers up to a given range
    static void printPrimeSum(int range) {

        int primeSum = 0;

        for(int i = 1; i <= range; i++) {
            if(checkPrime(i)) {
                primeSum += i;
            }
        }

        System.out.println("Sum of the prime numbers up to "+ range +" is: " + primeSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        printPrimeSum(range);

        sc.close();
    }
}
