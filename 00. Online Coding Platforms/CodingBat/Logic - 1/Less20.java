import java.util.Scanner;

public class Less20 {
    static boolean less20(int n) {
        if((n+1) % 20 == 0 || (n+2) % 20 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(less20(n));

        sc.close();
    }
}
