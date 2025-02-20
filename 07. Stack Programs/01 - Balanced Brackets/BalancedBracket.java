import java.util.Scanner;
import java.util.Stack;

public class BalancedBracket {

    // Method to check if brackets are balanced
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // If it's an opening bracket, push to stack
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.isEmpty() || st.peek() != ')') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == '}') {
                if (st.isEmpty() || st.peek() != '}') {
                    return false;
                } else {
                    st.pop();
                }
            } else if (ch == ']') {
                if (st.isEmpty() || st.peek() != ']') {
                    return false;
                } else {
                    st.pop();
                }
            }
        }

        // Return true if stack is empty (all brackets matched)
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        // Output result
        System.out.println(isBalanced(str));

        sc.close();
    }
}
