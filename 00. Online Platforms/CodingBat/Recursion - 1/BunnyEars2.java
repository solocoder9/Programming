import java.util.Scanner;

public class BunnyEars2 {
    public static int bunnyEars2(int bunnies) {
        // Base case
        if (bunnies == 0) {
            return 0;
        }

        // Recursive case
        if (bunnies % 2 == 0) {
            return 3 + bunnyEars2(bunnies - 1);
        } else {
            return 2 + bunnyEars2(bunnies - 1);
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bunnies = sc.nextInt();
        System.out.println(bunnyEars2(bunnies));

        sc.close();
    }
}
