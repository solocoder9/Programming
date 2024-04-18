import java.util.Scanner;

public class SumOfFactors {
    
    // Time Complexity: O(n), where n is the input number
    // Space Complexity: O(1)
    // Method to calculate the sum of the factors 
    static int sumOfFactors(int n) {

        int sumOfFactr = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                sumOfFactr += i;
            }
        }

        return sumOfFactr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Sum of factors of " + n + " is: " + sumOfFactors(n));

        sc.close();
    }
}
