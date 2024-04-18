import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        // Looping from 1 to 10 to print the multiplication
        for(int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }

        sc.close();
    }
}
