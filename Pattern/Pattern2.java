import java.util.Scanner;

public class Pattern2 {

    static void pattern(int n) {

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - 1; j++) {
                if(i == 1 || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
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
