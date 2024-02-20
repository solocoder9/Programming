import java.util.Scanner;

public class SumOfFactors {
    
    // Method to calculate to sum of the factors 
    static void printFactors(int n) {

        int sum = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sum += i;
            }
        }

        System.out.println("Sum of the factors is: " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printFactors(n);

        sc.close();
    }
}
