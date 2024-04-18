import java.util.Scanner;

public class LargestBtnThree {
    public static int checkGreatest(int a, int b, int c) {
        
        if(a > b && a > c) {
            System.out.println(a + " a is greatest");
            return a;
        }

        else if(b > c) {
            System.out.println(b + " b is greatest");
            return b;
        }

        else {
            System.out.println(c + " c is greatest");
            return c;
        }
    }   
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        checkGreatest(a, b, c);

        sc.close();
    }
}
