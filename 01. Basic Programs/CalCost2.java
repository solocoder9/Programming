// Java program to calculate the salary

import java.util.Scanner;

public class CalCost2 {
    // Method to calculate salary
    public static float check(int salary, int experience) {
        if (experience > 5) {
            return salary + (salary * 0.05f);
        } else {
            return salary;
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the salary: ");
        int salary = sc.nextInt();

        System.out.print("Enter the Experience: ");
        int experience = sc.nextInt();

        System.out.println(check(salary, experience));

        sc.close();
    }
}
