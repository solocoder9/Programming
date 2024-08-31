import java.util.Scanner;

public class PrintOddSeries {

    // Method to print Odd number up to n
    static void printOdd(int n) {
        int count = 1; 

        for(int i = 1; i <= n; i++) {
            System.out.print(count + " ");
            count += 2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printOdd(n);

        sc.close();
    }
    
}
