import java.util.Scanner;

public class ShareDigit {
    static boolean shareDigit(int a, int b) {
        if(((a >= 10 && a <= 99) && (b >= 10 && b <= 99)) && ((a/10 == b/10 || a/10 == b%10 || a%10 == b/10 || a%10 == b%10))) {
            return true;
        }
        else {
            return false;
        }
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print(shareDigit(a, b));

        sc.close();
    }
}
