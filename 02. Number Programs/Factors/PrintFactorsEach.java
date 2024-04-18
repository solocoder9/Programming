import java.util.Scanner;

public class PrintFactorsEach {
    
    // Method to print factors of a number
    static void factors(int n) {
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to print factors of each numbers
    static void printFactors(int range) {
        
        for(int i = 1; i <= range; i++) {
            System.out.print(i + " --> ");
            factors(i);
            System.out.println();
        }
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        printFactors(range);

        sc.close();
    }
}
