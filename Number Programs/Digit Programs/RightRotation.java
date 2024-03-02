import java.util.Scanner;

public class RightRotation {
    
    // Method to right rotation a number
    static int rightRotate(int n) {

        int temp = n;
        int digits = 0;
        while(temp > 0) {
            temp /= 10;
            digits++;
        }

        int mul = n / ((int) Math.pow(10, digits - 1));
        int div = n % ((int) Math.pow(10, digits - 1));

        int rightRot = div * ((int) Math.pow(10, (digits - (digits - 1)))) + mul;

        return rightRot;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println(rightRotate(n));

        sc.close();
    }
}
