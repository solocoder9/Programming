import java.util.Scanner;

public class RoundSum2 {
    
    // Helper method to round up a number to the nearest multiple of 10
    static int round10(int n) {
        
        // Math.round() is a predefined method to round a double value to the nearest integer,
        // and the result is then cast to an integer
        return (int) (Math.round(n / 10.0) * 10);
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
