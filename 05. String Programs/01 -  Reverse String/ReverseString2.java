import java.util.Scanner;

public class ReverseString2 {

    // Method to reverse a string using StringBuffer
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String reverseString(String str) {

        // StringBuffer reverse method
        return new StringBuffer(str).reverse().toString();
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to reverse: ");
        String str = sc.nextLine();

        // Display the reversed string
        System.out.println("The reversed string is: " + reverseString(str));

        sc.close();
    }
}
