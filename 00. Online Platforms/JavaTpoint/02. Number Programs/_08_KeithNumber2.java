// Java program to check whether the number is Keith number or not
// Efficient approach

import java.util.Scanner;

public class _08_KeithNumber2 {

    // Method to check whether the number is a Keith number or not
    public static boolean isKeith(int n) {

        // Count the number of digits by converting the number to a string
        int countDgt = ("" + n).length();

        // Initialize an array to store the digits of the number
        int[] arr = new int[countDgt];

        // Add the digits into the array
        int temp = n;
        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = temp % 10; 
            temp /= 10; 
        }

        // Calculate the Keith number sequence
        int sum = 0;
        while (sum < n) {
            sum = arr[0];
            // Shift the elements to the left and calculate the sum
            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
                sum += arr[i];
            }
            // Place the sum at the end of the array
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
