import java.util.Scanner;

public class Triangle {
    public static int triangle(int rows) {
        // Base case
        if (rows == 0) {
            return 0;
        }

        // Recursive case
        return rows + triangle(rows - 1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        System.out.println(triangle(rows));

        sc.close();
    }
}
