import java.util.Scanner;

public class _46_AutomorphicNumber {

    // Method to check whether the number is Automorphic number or not
    public static boolean isAutomorphic(int n) {
        int countDigit = (n + "").length();

        int squareOfN = n * n;

        return n == squareOfN % (int) Math.pow(10, countDigit);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (isAutomorphic(n)) {
            System.out.println("Automorphic number");
        } else {
            System.out.println("Not a Automorphic number");
        }

        sc.close();
    }
}
