package Recursion_CodingBat;

import java.util.Scanner;

public class CountHi {
    public static int countHi(String str) {
        // Base case
        if (str.length() <= 1) {
            return 0;
        }

        // Recursive case
        if (str.startsWith("hi")) {
            return 1 + countHi(str.substring(2));
        } else {
            return countHi(str.substring(1));
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(countHi(str));

        sc.close();
    }
}
