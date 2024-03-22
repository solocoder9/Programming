import java.util.Scanner;

public class Pattern1 {

    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for(int j = n; j <= n - 1; j++) {
                if(i == n || j == 1) {
                    System.out.print("*");
                }
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
