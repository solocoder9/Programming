import java.util.Scanner;

public class Pattern13 {

    static void pattern(int n) {

        for(int i = 1; i <= n; i++) {

            // Printing spaces
            int range = i <= (n / 2 + 1) ? i : n - i + 1;
            for(int j = 1; j <= range; j++) {
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
