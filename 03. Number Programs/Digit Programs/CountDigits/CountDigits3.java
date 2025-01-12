import java.util.Scanner;

public class CountDigits3 {

    // Method to count digits of a number
    public static int countDigits(int n) {
        return (int) (Math.log10(n) + 1);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any number: ");
        int n = sc.nextInt();

        System.out.println("Number of digits is: " + countDigits(n));

        sc.close();
    }
}
