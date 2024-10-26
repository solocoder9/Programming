import java.util.Scanner;

public class ReverseString {
    
    // Method to reverse a string
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String reverseString(String str) {
        String reverse = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        
        return reverse;
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
