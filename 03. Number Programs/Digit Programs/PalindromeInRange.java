import java.util.Scanner;

public class PalindromeInRange {
    
    // Method to check if the number is palindrome or not
    static boolean checkPalindrome(int number) {

        if(number < 0) {
            return false;
        }

        int temp = number;
        int reverseNumber = 0;

        while (temp > 0) {
            int rem = temp % 10;
            reverseNumber = (reverseNumber * 10) + rem;
            temp /= 10;
        }

        return number == reverseNumber;
    }

    // Method to print palindrome numbers within a given range
    static void printPalindrome(int start, int end) {

        for (int i = start; i <= end; i++) {
            if (checkPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending range: ");
        int end = sc.nextInt();

        printPalindrome(start, end);

        sc.close();
    }
}
