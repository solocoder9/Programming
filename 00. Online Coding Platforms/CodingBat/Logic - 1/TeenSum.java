import java.util.Scanner;

public class TeenSum {
    static int teenSum(int a, int b) {
        if((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) {
            return 19;
        }
        else {
            return a+b;
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println(teenSum(a, b));

        sc.close();
    }
}
