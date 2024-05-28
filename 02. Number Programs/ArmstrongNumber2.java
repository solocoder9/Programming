import java.util.Scanner;

public class ArmstrongNumber2 {

    // Method to check whether the number is armstrong or not
    // using Math.pow()
    public static boolean checkArmstrong(int n) {
        int temp = n;
        int countDigit = 0;

        while (temp > 0) {
            countDigit++;
            temp /= 10;
        }

        temp = n; // Reset the temp variable
        int sum = 0;

        while (temp > 0) {
            int rem = temp % 10;
            sum += Math.pow(rem, countDigit);
            temp /= 10;
        }

        return n == sum;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (checkArmstrong(n)) {
            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }

        sc.close();
    }
}
