import java.util.Scanner;

public class RoundSum {
    
    // Helper method to round up a number
    static int round10(int n) {
        if((n % 10) < 5) {
            n = (n/10) * 10;
        }

        else if((n % 10) >= 5) {
            n = ((n/10) * 10) + 10;
        }

        return n;
    }

    // Method to return sum
    static int roundSum(int a, int b, int c) {
        a = round10(a);
        b = round10(b);
        c = round10(c);

        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c: ");
        int c = sc.nextInt();

        System.out.println(roundSum(a, b, c));

        sc.close();
    }
}
