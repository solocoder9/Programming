import java.util.Scanner;

public class PrintPrimeFactors {
    
    // Time Complexity: O(sqrt(n)), where n is the input number
    // Space Complexity: O(1)
    // Method to print prime factors of a number
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
