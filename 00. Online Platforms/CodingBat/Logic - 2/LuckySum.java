import java.util.Scanner;

public class LuckySum {
    
    // Method to return sum
    static int luckySum(int a, int b, int c) {
        if(a == 13) {
            return 0;
        }
        else if(b == 13) {
            return a;
        }
        else if(c == 13) {
            return a + b;
        }

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

        System.out.println(luckySum(a, b, c));

        sc.close();
    }
}
