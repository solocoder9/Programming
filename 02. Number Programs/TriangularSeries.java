// 1 3 6 10 15 21 28 36 45 55 

import java.util.Scanner;

public class TriangularSeries {

    // Method to print triangular series
    public static void printTri(int n) {

        int temp = 0;
        for (int i = 1; i <= n; i++) {
            temp += i;
            System.out.print(temp + " ");
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printTri(n);

        sc.close();
    }
}
