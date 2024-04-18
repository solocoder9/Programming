// Print leap year in given range

import java.util.Scanner;

public class _07_PrintLeapYear {
    
    // Method to check if the year is leap or not
    static boolean checkLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    // Method to print leap year in given range
    static void printLeapYear(int start, int end) {

        for (int i = start; i <= end; i++) {
            if(checkLeapYear(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        printLeapYear(start, end);

        sc.close();
    }
}
