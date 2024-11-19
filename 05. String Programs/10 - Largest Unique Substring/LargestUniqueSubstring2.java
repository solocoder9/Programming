import java.util.HashSet;
import java.util.Scanner;

public class LargestUniqueSubstring2 {

    // Method to find the largest unique substring
    // Time Complexity: O(n) 
    // Space Complexity: O(n) 
    public static String largestUniqueSubstring(String str) {
    	
        int maxLength = 0, start = 0;
        String result = "";

        HashSet<Character> set = new HashSet<>();

        for (int end = 0; end < str.length(); end++) {
        	
            // Slide the start pointer if a duplicate character is found
            while (set.contains(str.charAt(end))) {
                set.remove(str.charAt(start));
                start++;
            }

            // Add the current character to the set
            set.add(str.charAt(end));

            // Check if the current window is the largest so far
            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                result = str.substring(start, end + 1);
            }
        }

        return result;
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
