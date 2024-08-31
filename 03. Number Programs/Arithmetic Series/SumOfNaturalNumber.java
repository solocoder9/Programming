import java.util.Scanner;

public class SumOfNaturalNumber {
    
    // Method to calculate sum of series
    static int sum(int n) {
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(sum(n));

        sc.close();
    }
}
