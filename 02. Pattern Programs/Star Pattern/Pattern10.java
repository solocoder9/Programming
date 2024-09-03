/*

        *
       ***
      *****
     *******
    *********
    *********
     *******
      *****
       ***
        *

 */

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 2 * n; i++) {

            int temp = 0;

            // for printing spaces
            int target = i <= n ? n - i : i - (n + 1);
            for (int j = 1; j <= target; j++) {
                System.out.print(" ");
                temp = j;
            }

            // for printing stars
            int target2 = i <= n ? 2 * i - 1 : (3 * n) - temp - i;
            for (int k = 1; k <= target2; k++) {
                System.out.print("*");
            }

            System.out.println();
        }

        sc.close();
    }
}
