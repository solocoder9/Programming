import java.util.Scanner;

public class PrintFactors {
    
    // Method to print factors of a number 
    static void printFactors(int n) {
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printFactors(n);

        sc.close();
    }
}
