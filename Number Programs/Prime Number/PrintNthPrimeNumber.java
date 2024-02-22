import java.util.Scanner;

public class PrintNthPrimeNumber {
    
    // Method to check the number is prime or not
    static boolean isPrime(int n) {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        int count = 0;
        int number = 2;

        while(count < n) {
            if(isPrime(number)) {
                count++;
                if(count == n) {
                    System.out.println("Nth Prime number is: " + number);
                }   
            }
            number++;
        }

        sc.close();
    }
}
