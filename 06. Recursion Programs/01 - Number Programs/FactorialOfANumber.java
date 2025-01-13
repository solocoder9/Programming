import java.util.Scanner;

public class FactorialOfANumber {

    // Recursive method to calculate factorial of a number
    public static int factorial(int n) {

        // Base case: if n is 0 or 1, return 1
        if (n <= 1) {
            return 1;
        }

        // Recursive case
        return n * factorial(n - 1);
    }


    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " is: " + factorial(n));

        sc.close();
    }
}
