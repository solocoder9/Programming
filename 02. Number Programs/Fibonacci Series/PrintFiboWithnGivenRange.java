import java.util.Scanner;

public class PrintFiboWithnGivenRange {

    // Method to print fibonacci series with in given range
    public static void print(int range) {
        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 1; i <= range; i++) {
            if (i == a + b) {
                System.out.print(i + " ");
                a = b;
                b = i;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        print(range);

        sc.close();
    }
}
