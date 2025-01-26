import java.util.Scanner;

public class _42_RemoveZerosFromANumber2 {

    // Method to remove zeros from a number
    public static int removeZeros(int n) {

        return Integer.parseInt((n + "").replace("0", ""));
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
