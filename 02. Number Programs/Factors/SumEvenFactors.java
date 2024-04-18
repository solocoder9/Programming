import java.util.Scanner;

public class SumEvenFactors {
    
    // Method to calculate sum of evenFactors
    static void printFactors(int n) {
        int sumeven = 0;
        for(int i = 1; i <= n; i++) {
            if((n % i == 0) && (i % 2 == 0)) {
                sumeven += i;
            }
        }

        System.out.println("Sum of even factors is: " + sumeven);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printFactors(n);

        sc.close();
    }
}
