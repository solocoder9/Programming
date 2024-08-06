import java.util.Scanner;

public class SumOfNevenNumber {

    // Method to print sum of n even number
    static void sumEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 2;
        }

        System.out.println("Sum of n even number is: " + sum);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        sumEven(n);

        sc.close();
    }
}
