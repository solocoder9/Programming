import java.util.Scanner;

public class SumOfNaturalNumber2 {
    
    // Method to calculate sum of series
    static int sum(int n) {
        
        return (n * (n + 1) / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Sum of natural number is: " + sum(n));

        sc.close();
    }
}
