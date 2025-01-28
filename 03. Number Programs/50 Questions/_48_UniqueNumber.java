import java.util.Scanner;

public class _48_UniqueNumber {

    // Method to check whether the number is a Unique number or not
    public static boolean isUnique(int n) {
        boolean[] digitSeen = new boolean[10];
        while (n > 0) {
            int digit = n % 10;
            if (digitSeen[digit]) {
                return false;
            } else {
                digitSeen[digit] = true;
            }

            n /= 10;
        }

        return true;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (isUnique(n)) {
            System.out.println("Unique number");
        } else {
            System.out.println("Not a Unique number");
        }

        sc.close();
    }
}
