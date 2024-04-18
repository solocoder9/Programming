import java.util.Scanner;

public class Love6 {
    static boolean love6(int a, int b) {
        int sum = a + b;
        int diff = Math.abs(a - b);

        if(a == 6 || b == 6 || sum == 6 || diff == 6) {
            return true;
        }
        else {
            return false;
        }
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println(love6(a, b));

        sc.close();
    }
}
