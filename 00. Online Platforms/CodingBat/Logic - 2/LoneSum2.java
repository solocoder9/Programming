import java.util.Scanner;

public class LoneSum2 {

    // Method to return sum
    static int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            return 0;
        } else if (a == b) {
            return c;
        } else if (a == c) {
            return b;
        } else if (b == c) {
            return a;
        }

        return a + b + c;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int c = sc.nextInt();

        System.out.println(loneSum(a, b, c));

        sc.close();
    }
}
