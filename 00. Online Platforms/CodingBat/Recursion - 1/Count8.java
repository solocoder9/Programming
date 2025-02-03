import java.util.Scanner;

public class Count8 {
    public static int count7(int n) {
        // Base case
        if (n == 0) {
            return 0;
        }

        // Recursive case
        if (n % 10 == 8) {
            return 1 + count7(n / 10);
        } else {
            return count7(n / 10);
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        System.out.println(count7(n));

        sc.close();
    }
}
