import java.util.Scanner;

public class _47_FloydsTriangle {

    // Method to print Floyd's triangle
    public static void floydTriangle(int n) {
        int temp = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(temp + " ");
                temp++;
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        floydTriangle(n);

        sc.close();
    }
}
