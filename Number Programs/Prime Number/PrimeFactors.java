import java.util.Scanner;

public class PrimeFactors {
    
    // Method to print prime factors
    static void printPrimeFactors(int n) {

        for(int i = 2; i * i <= n; i++) {
            while(n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if(n != 1) {
            System.out.print(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printPrimeFactors(n);

        sc.close();
    }
}
