import java.util.Scanner;

public class PrintEvenOdd {

    // Method to print even numbers
    static void even(int a, int b) {
        for(int i = a; i <= b; i++) {
            if(i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    // Method to print odd numbers
    static void odd(int a, int b) {
        for(int i = a; i <= b; i++) {
            if(i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        even(a, b);
        System.out.println("\n");
        odd(a, b);

        sc.close();
    }
    
}
