import java.util.Scanner;

public class BunnyEars {
    public static int bunnyEars(int bunnies) {
        // Base case
        if (bunnies == 0) {
            return 0;
        }

        // Recursive case
        return 2 + (bunnyEars(bunnies - 1));
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bunnies = sc.nextInt();
        System.out.println(bunnyEars(bunnies));

        sc.close();
    }
}
