import java.util.Scanner;

public class ReverseNumber2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        int digit = 0, reverseNumber = 0;
        while(number > 0) {
            digit = number % 10;
            reverseNumber = (reverseNumber * 10) + digit;
            number /= 10;
        }

        System.out.println("Reversed number is: " + reverseNumber);

        sc.close();
    }
}
