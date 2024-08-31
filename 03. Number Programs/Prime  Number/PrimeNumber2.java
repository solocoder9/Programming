import java.util.Scanner;

public class PrimeNumber2 {

    // Time Complexity: O(sqrt(n)), where n is the input number
    // Space Complexity: O(1)
    // Method to check if the number is prime of not
    public static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        }
        int count = 0;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        return (count == 0);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        if (checkPrime(n)) {
            System.out.println("Prime number");
        } else {
            System.out.println("Not a Prime number");
        }

        sc.close();
    }
}
