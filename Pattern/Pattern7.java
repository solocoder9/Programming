import java.util.Scanner;

public class Pattern7 {

    static void pattern(int n) {

        for (int i = n; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
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
