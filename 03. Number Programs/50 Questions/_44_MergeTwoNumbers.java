import java.util.Scanner;

public class _44_MergeTwoNumbers {

    // Method to merge two numbers n2 to the left side of n1
    public static int mergeRight(int n1, int n2) {
        int countDigitOfN2 = (n2 + "").length();

        return (n1 * (int) Math.pow(10, countDigitOfN2)) + n2;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2: ");
        int n2 = sc.nextInt();

        System.out.println("Merged number is: " + mergeRight(n1, n2));

        sc.close();
    }
}
