import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        // Swapping two numbers using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        sc.close();
    }
}
