import java.util.Scanner;

public class _38_PrintAGivenSeries {

    // Method to print a given series
    // Input: n = 6
    // Output: 1 2 5 10 17 26
    public static void printSeries(int n) {

        int i = 2;
        int temp = 3;
        System.out.print(1 + " ");
        while (n > 1) {
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
