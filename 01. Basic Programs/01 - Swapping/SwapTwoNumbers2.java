import java.util.Scanner;

public class SwapTwoNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        // Swapping two numbers without using a third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        sc.close();
    }
}