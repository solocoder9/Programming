import java.util.Scanner;

public class FactorialOfaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // Logic to find factorial of a number
        int factorial = 1;
        for(int i = 2; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + number + " is: " + factorial);

        sc.close();
    }    
}
