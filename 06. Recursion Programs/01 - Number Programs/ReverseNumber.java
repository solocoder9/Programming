import java.util.Scanner;

public class ReverseNumber {

    // Static variable to store the reversed number
    static int reversed = 0;

    // Recursive method to reverse a number
    public static void reverseNumber(int n) {
        
        // Base case: If the number is 0, stop recursion
        if (n == 0) {
            return;
        }

        // Recursive case: Process the last digit and update the reversed number
        reversed = reversed * 10 + (n % 10);

        // Recursively call the function with the remaining number
        reverseNumber(n / 10);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        // Call the recursive method to reverse the number
        reverseNumber(n);

        // Print the reversed number
        System.out.println("The reversed number is: " + reversed);

        sc.close();
    }
}
