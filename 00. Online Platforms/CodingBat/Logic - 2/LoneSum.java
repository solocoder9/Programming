import java.util.Scanner;

public class LoneSum {

    // Method to return sum
    public static int loneSum(int a, int b, int c) {
        if (a == b && a == c) {
            a = 0;
            b = 0;
            c = 0;
        } else if (a == b) {
            a = 0;
            b = 0;
        } else if (a == c) {
            a = 0;
            c = 0;
        } else if (b == c) {
            b = 0;
            c = 0;
        }

        int sum = a + b + c;

        return sum;
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
