import java.util.Scanner;

public class FactorialOfaNumber {
    // Method to calculate factorial of a number
    static int calFactorial(int n) {
        int factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is: " + calFactorial(n));

        sc.close();
    }
}