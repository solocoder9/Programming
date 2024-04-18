import java.util.Scanner;

public class PrintEvenFactors {
    
    // Time Complexity: O(n), where n is the input number
    // Space Complexity: O(1)
    // Method to print even factors of a number 
    static void printEvenFactors(int n) {
        for(int i = 1; i <= n; i++) {
            if((n % i == 0) && (i % 2 == 0)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        printEvenFactors(n);

        sc.close();
    }
}
