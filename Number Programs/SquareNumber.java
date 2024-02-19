import java.util.Scanner;

public class SquareNumber {
    
    // Method to print squrare numbers 
    static void print(int n) {
        for(int i = 1; i <= n; i++) {
            System.out.print((i * i) + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        print(n);

        sc.close();
    }
}
