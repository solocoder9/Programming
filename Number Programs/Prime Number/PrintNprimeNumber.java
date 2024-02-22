import java.util.Scanner;

public class PrintNprimeNumber {
    
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

    // Method to print N prime numbers
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
