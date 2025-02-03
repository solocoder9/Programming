import java.util.Scanner;

public class PowerN {
    public static int powerN(int base, int n) {
        // Base case
        if (n == 0) {
            return 1;
        }

        // Recursive case
        return base * powerN(base, n - 1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int base = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(powerN(base, n));

        sc.close();
    }
}
