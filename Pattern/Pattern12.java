import java.util.Scanner;

public class Pattern12 {

    static void pattern(int n) {

        for(int i = n; i >= 1; i--) {

            // Printing spaces
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }

            // Printing stars
            for(int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of n: ");
        int n = sc.nextInt();

        pattern(n);

        sc.close();
    }
}
