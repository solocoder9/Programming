import java.util.Scanner;

public class _37_PrintAGivenSeries {

    // Method to print a given series
    // Input: n = 6
    // Output: 1 3 6 10 15 21
    public static void printSeries(int n) {

        int i = 1;
        int temp = 2;

        while (n >= 1) {
            System.out.print(i + " ");
            i += temp;
            temp += 1;
            n--;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printSeries(n);

        sc.close();
    }
}
