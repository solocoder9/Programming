import java.util.Scanner;

public class PrintFactors2 {
    
    // Method to print factors of a number excluding 1 and n
    static void printFactors(int n) {
        for(int i = 2; i < n; i++) {
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
