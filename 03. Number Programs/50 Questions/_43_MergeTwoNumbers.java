import java.util.Scanner;

public class _43_MergeTwoNumbers {

    // Method to merge two numbers n2 to the right side of n1
    public static int mergeLeft(int n1, int n2) {
        int countDigitOfN2 = (n1 + "").length();

        return (n2 * (int) Math.pow(10, countDigitOfN2)) + n1;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter the value of n2: ");
        int n2 = sc.nextInt();

        System.out.println("Merged number is: " + mergeLeft(n1, n2));

        sc.close();
    }
}
