import java.util.Scanner;

public class Old35 {
    public static boolean old35(int n) {
        // if((n%3 == 0 || n%5 == 0) && (n%3 != 0 || n%5 != 0)) {
        //     return true;
        // }
        if(n%3 == 0 ^ n%5 == 0) {
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

        System.out.println(old35(n));

        sc.close();
    }
}
