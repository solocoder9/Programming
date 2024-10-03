import java.util.Scanner;

public class Test2 {
    public static boolean find(int a, int b) {
        int sum = a + b;
        int dif = Math.abs(a - b);
        if ((a == 6 || b == 6) || (sum == 6 || dif == 6)) {
            return true;
        } else {
            return false;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print(find(a, b));

        sc.close();

    }
}
