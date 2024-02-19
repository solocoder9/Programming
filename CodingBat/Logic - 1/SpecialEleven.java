import java.util.Scanner;

public class SpecialEleven {
    public static boolean specialEleven(int n) {
        if(n % 11 == 0 || --n % 11 == 1) {
            return true;
        }

        else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(specialEleven(n));

        sc.close();
    }
}


