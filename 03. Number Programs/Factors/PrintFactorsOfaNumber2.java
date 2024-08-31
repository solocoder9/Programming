import java.util.Scanner;

public class PrintFactorsOfaNumber2 {

    // Time Complexity: O(sqrt(n)), where n is the input number
    // (Note: O(n/2) is equivalent to O(sqrt(n)) in terms of big O notation)
    // Space Complexity: O(1)
    // Method to print factors of a number
    public static void printFactors(int n) {

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }

        // Print the number itself
        if (n != 0) {
            System.out.print(n);
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
