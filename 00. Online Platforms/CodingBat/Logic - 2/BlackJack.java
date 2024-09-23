import java.util.Scanner;

public class BlackJack {

    public static int blackjack(int a, int b) {

        if (a > 0 && b > 0) {
            if (a <= 21 && b > 21) {
                return a;
            }
            if (b <= 21 && a > 21) {
                return b;
            }
            if (((21 - a) < (21 - b)) && (a <= 21)) {
                return a;
            }
            if (((21 - b) < (21 - a)) && (b <= 21)) {
                return b;
            }

        }
        if (a > 21 && b > 21) {
            return 0;
        }

        return 0;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.println(blackjack(a, b));

        sc.close();
    }
}
