import java.util.Scanner;

public class LastDigit {
    
    // Method to return the last digit of a number
    static int lastDigits(int n) {

        return n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Last digit of "+ n + " is: " +lastDigits(n));

        sc.close();
    }
}
