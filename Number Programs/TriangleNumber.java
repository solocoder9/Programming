import java.util.Scanner;

public class TriangleNumber {
    
    // Method to print squrare numbers 
    static void printTri(int n) {

        int temp = 1;
        for(int i = 2; i <= n+1; i++) {
            System.out.print(temp + " ");
            temp += i;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        printTri(n);

        sc.close();
    }
}
