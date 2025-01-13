import java.util.Scanner;

public class PowerOfANumber {

    // Recursive method to calculate the power of a number
    public static int power(int base, int exponent) {

        // Base case: If exponent is 0, return 1 (any number raised to power 0 is 1)
        if (exponent == 0) {
            return 1;
        }

        // Recursive case: Multiply base with the result of the base raised to (exponent-1)
        return base * power(base, exponent - 1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();

        System.out.println(base + " to the power " + exponent + " is: " + power(base, exponent));

        sc.close();
    }
}
