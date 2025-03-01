import java.util.Scanner;

public class ToggleString {
    
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    // Method to toggle the case of each character in the string
    public static String toggleString(String str) {
        
        // Convert the string to a character array 
        char[] charArr = str.toCharArray();
        
        for (int i = 0; i < charArr.length; i++) {
            char ch = charArr[i];
            
            // If the character is lowercase, convert it to uppercase
            if (Character.isLowerCase(ch)) {
                charArr[i] = Character.toUpperCase(ch);
            } else {
                // If the character is uppercase, convert it to lowercase
                charArr[i] = Character.toLowerCase(ch);
            }
        }

        return new String(charArr);
    }

    // Driver code
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        
        // Display the toggled string
        System.out.println(toggleString(str));

        sc.close();
    }
}
