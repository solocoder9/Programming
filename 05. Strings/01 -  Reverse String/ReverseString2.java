import java.util.Scanner;

public class ReverseString2 {
    
    // Method to reverse a string using a two-pointer approach
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public static String reverseString(String str) {

        // Convert the input string to a character array
        char[] charArr = str.toCharArray();
        int low = 0, high = str.length() - 1;
        
        // Reverse the character array using a two-pointer approach
        while (low < high) {
            char temp = charArr[low];
            charArr[low] = charArr[high];
            charArr[high] = temp;
            low++;
            high--;
        }
        
        // Convert the char array back to a string
        return new String(charArr);
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
