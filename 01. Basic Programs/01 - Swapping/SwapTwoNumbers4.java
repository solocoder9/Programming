import java.util.Scanner;

public class SwapTwoNumbers4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        // Swap two numbers using destructuring assignment (Java 14 or later)
        a = a + b - (b = a);

        System.out.println("After swapping:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        sc.close();
    }
}
