import java.util.Scanner;

public class PrintFactorsOfaNumber {

    // Time Complexity: O(n), where n is the input number
    // Space Complexity: O(1)
    // Method to print factors of a number
    public static void printFactors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printFactors(n);

        sc.close();
    }
}
