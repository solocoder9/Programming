import java.util.Scanner;

public class _36_PrintAGivenSeries {

    // Method to print a given series
    // Input: n = 10
    // Output: 1 4 9 16 25 36 49 64 81 100
    public static void printSeries(int n) {

        int i = 1;
        int temp = 3;

        while (n >= 1) {
            System.out.print(i + " ");
            i += temp;
            temp += 2;
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
