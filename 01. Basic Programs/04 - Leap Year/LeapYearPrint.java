// Java program to print leap years between two ranges

import java.util.Scanner;

public class LeapYearPrint {

    // Method to check whether the year is a leap year or not
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to print the leap years between two ranges
    public static void printLeapYears(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (isLeapYear(i)) {
                System.out.println(i + " ");
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        // Print leap years
        printLeapYears(start, end);

        sc.close();
    }
}
