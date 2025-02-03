import java.util.Scanner;

public class CountX {
    public static int countX(String str) {
        // Base case
        if (str.isEmpty()) {
            return 0;
        }

        // Recursive case
        if (str.charAt(0) == 'x') {
            return 1 + countX(str.substring(1));
        } else {
            return countX(str.substring(1));
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        System.out.println(countX(str));

        sc.close();
    }
}
