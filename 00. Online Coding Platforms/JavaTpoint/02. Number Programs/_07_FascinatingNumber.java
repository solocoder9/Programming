// Java program to check whether the number is Fascinating number or not

import java.util.Scanner;

public class _07_FascinatingNumber {

    // Method to check whether the number is Fascinating number or not
    public static boolean isFascinating(int n) {

        int temp = n;
        int digitsCout = 0;
        while (temp > 0) {
            temp /= 10;
            digitsCout++;
        }

        if (digitsCout < 3) {
            return false;
        }

        int twoTimes = 2 * n;
        int threeTimes = 3 * n;

        String mergedNumber = n + "" + twoTimes + threeTimes;

        for (char digit = '1'; digit <= '9'; digit++) {
            int count = 0;
            for (int i = 0; i < mergedNumber.length(); i++) {
                if (mergedNumber.charAt(i) == digit) {
                    count++;
                }
            }
            if (count != 1) {
                return false;
            }
        }

        return true;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isFascinating(n)) {
            System.out.println(n + " is a Fascinating Number");
        } else {
            System.out.println(n + " is not a Fascinating Number");
        }

        sc.close();
    }
}
