import java.util.Scanner;

public class CalCost2 {
    public static float check(int salary, int experience) {
        if(experience > 5){
            return salary + (salary * 0.05f);
        }
        else {
            return salary;
        }
    }

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
