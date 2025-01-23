import java.util.Scanner;

public class _28_PerfectNumber {

    // Method to check whether the number is a Perfect number or not
    public static boolean isPerfect(int n) {
        int sumOfFactors = 0;

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sumOfFactors += i;
            }
        }

        return sumOfFactors == n;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = sc.nextInt();

        System.out.println(isPerfect(N) ? "Perfect number" : "Not a Perfect number");

        sc.close();
    }
}
