import java.util.Scanner;

public class _42_RemoveZerosFromANumber {

    // Method to remove zeros from a number
    public static int removeZeros(int n) {

        int nonZeroNum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            if (lastDigit != 0) {
                nonZeroNum = (nonZeroNum * 10) + lastDigit;
            }
            n /= 10;
        }

        // Reverse the nonZeroNum
        int num = 0;
        while (nonZeroNum > 0) {
            int lastDigit = nonZeroNum % 10;
            num = (num * 10) + lastDigit;
            nonZeroNum /= 10;
        }

        return num;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(removeZeros(n));

        sc.close();
    }
}
