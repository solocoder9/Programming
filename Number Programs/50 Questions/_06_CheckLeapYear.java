// check given year is leap year or not

import java.util.Scanner;

public class _06_CheckLeapYear {
    
    // Method to check if the year is leap or not
    static boolean checkLeapYear(int year) {

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = sc.nextInt();

        if (checkLeapYear(year)) {
            System.out.println("Leap year");
        }    
        else {
            System.out.println("Not a leap year");
        }

        sc.close();
    }
}
