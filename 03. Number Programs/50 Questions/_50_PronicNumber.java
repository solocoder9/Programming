import java.util.Scanner;

public class _50_PronicNumber {

    // Method to check whether a number is a Pronic number
    public static boolean isPronic(int n) {
        if (n < 0) {
            return false;
        } else if (n == 0) {
            return true;
        }

        // Check if the number is a product of two consecutive integers
        for (int i = 1; i * i <= n; i++) {
            if (i * (i + 1) == n) {
                return true;
            }
        }

        return false;
    }

    // Driver code
    public static void main(String[] ags) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to check: ");
        int n = sc.nextInt();

        System.out.println((isPronic(n)) ? "Pronic number" : "Not a Pronic number");

        sc.close();
    }
}
