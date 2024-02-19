import java.util.Scanner;

public class CheckTeenage {
    public static boolean check(int age) {
        if(age >= 13 && age <= 19) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        System.out.println(check(age));

        sc.close();
    }
}
