import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // Reverse the number using a loop
        int digit = 0;
        while(number > 0) {
            digit = number % 10;
            System.out.print(digit);
            number /= 10;
        }

        sc.close();
    }
}
