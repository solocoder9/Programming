import java.util.Scanner;

public class NoTeenSum {

    // Helper method to fix the teen
    static int fixTeen(int n) {
        if((n >= 13 && n <= 19) && (n != 15 && n != 16)) {
            n = 0;
        }

        return n;
    }

    // Method to return the sum
    static int noTeenSum(int a, int b, int c) {
        a = fixTeen(a);
        b = fixTeen(b);
        c = fixTeen(c);

        int sum = a + b + c;

        return sum;

    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.println(noTeenSum(a, b, c));

        sc.close();        
    }
}
