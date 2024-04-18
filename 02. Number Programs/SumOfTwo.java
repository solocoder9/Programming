import java.util.Scanner;

public class SumOfTwo {

    // Method to calculate the sum of two numbers
    public static int calSum(int a , int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println("Sum of a & b = " + calSum(a, b));

        sc.close();
    }
}

