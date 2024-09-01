import java.util.Scanner;

public class CloseFar {
    
    static boolean closeFar(int a, int b, int c) {
        if(((Math.abs(b - a) <= 1) || (Math.abs(c - a) <= 1))) {

            if((Math.abs(b - a) <= 1) && ((Math.abs(a - c) >= 2) && Math.abs(b - c) >= 2)) {
                return true;
            }
            
            if((Math.abs(c - a) <= 1) && ((Math.abs(a - b) >= 2) && Math.abs(b - c) >= 2)) {
                return true;
            }
        } 

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.println(closeFar(a, b, c));

        sc.close();
    }
}
