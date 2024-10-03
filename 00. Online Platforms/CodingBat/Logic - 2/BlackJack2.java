import java.util.Scanner;

public class BlackJack2 {
    
    public static int blackjack(int a, int b) {
 
        if(a > 21 && b > 21) {
            return 0;
        }
        if(a <= 21 && ((b > 21) || (21 - a) < (21 - b))) {
            return a;
        }
        if(b <= 21 && ((a > 21) || (21 - b) < (21 - a))) {
            return b;
        }

        return 0;
    }

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
