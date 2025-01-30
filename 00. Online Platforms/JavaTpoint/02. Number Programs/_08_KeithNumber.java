// Java program to check whether the number is Keith number or not

import java.util.Scanner;

public class _08_KeithNumber {

    // Method to check whether the number is Keith number or not
    public static boolean isKeith(int n) {

        // Count digits
        int temp = n;
        int countDgt = 0;
        while (temp > 0) {
            temp /= 10;
            countDgt++;
        }

        // Add the digits into array
        temp = n;
        int[] arr = new int[countDgt];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp % 10;
            temp /= 10;
        }

        // Calculate Keith number sequence
        int sum = 0;
        while (sum < n) {
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i];
            }

            // Shift the elements to the left
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = sum;
        }

        return sum == n;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isKeith(n)) {
            System.out.println(n + " is a Keith number");
        } else {
            System.out.println(n + " is not a Keith number");
        }

        sc.close();
    }
}
