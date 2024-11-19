import java.util.Scanner;

public class LargestUniqueSubstring {

    // Method to check whether the string is unique or not
    // Time Complexity: O(n) 
    // Space Complexity: O(1) 
    public static boolean isUnique(String str) {
        boolean[] seen = new boolean[256];
        for (int i = 0; i < str.length(); i++) {
            if (seen[str.charAt(i)]) {
                return false;
            }
            seen[str.charAt(i)] = true; 
        }
        return true;
    }

    // Method to find the largest unique substring 
    // Time Complexity: O(n^3) 
    // Space Complexity: O(1) 
    public static String largestUniqueSubstring(String str) {
        String longest = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                String substring = str.substring(i, j); // Generates substring
                if (isUnique(substring) && substring.length() > longest.length()) {
                    longest = substring;
                }
            }
        }
        return longest;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Find and display the largest unique substring
        System.out.println("Largest unique substring is: " + largestUniqueSubstring(str));

        sc.close();
    }
}
