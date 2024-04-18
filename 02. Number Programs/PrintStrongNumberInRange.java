import java.util.Scanner;

public class PrintStrongNumberInRange {

    // Method to calculate the foctorial
    static int factorial(int n) {

        int factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    // Method to check if the number is strong or not
    static boolean strongNumber(int n) {

        int factSum = 0;
        int temp = n;

        while (temp > 0) {
            int rem = temp % 10;
            factSum += factorial(rem);
            temp /= 10;
        }

        return n == factSum;
    }

    // Method to print Strong number in given range 
    static void printStrong(int start, int end) {

        for (int i = start; i <= end; i++) {
            if(strongNumber(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        printStrong(start, end);

        sc.close();
    }
    
}
