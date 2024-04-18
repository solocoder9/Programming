import java.util.Scanner;

public class CheckLastDigit {
    
    // Method to check the last digit of a number is even or odd
    static void checkLastDigit(int number) {
        
        if((number % 10) % 2 == 0) {
            System.out.println("Last digit is an even number");
        }
        else {
            System.out.println("Last digit is an odd number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        checkLastDigit(number);

        sc.close();
    }
}
