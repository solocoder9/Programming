import java.util.Scanner;

public class FirstDigit {
    
    // Method to return the first digit of a number
    static int firstDigits(int n) {

        int firstDgt = 0;

        while (n > 0) {
            firstDgt = n;
            n /= 10;
        }

        return firstDgt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Last digit of "+ n + " is: " +firstDigits(n));

        sc.close();
    }
}
