import java.util.Scanner;

public class CircularPrime {

    // Method to check if the number is prime or not
    static boolean checkPrime(int n) {

        if (n <= 1) {
            return false;
        }
        else if (n <= 3) {
            return true;
        }
        else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i <= Math.sqrt(n); i += 6) {
            //6k ± 1, where k is a natural number
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }   
    
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

    // Method to check if the number is circular prime of not
    static boolean checkCircularPrime(int n) {

        int digits = 0;
        int temp = n;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        int countPrime = 0;
        for(int i = 1; i <= digits; i++) {
            if(checkPrime(n)) {
                countPrime++;
                rightRotate(n);
            }
        }

        return countPrime == digits;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if (checkCircularPrime(n)) {
            System.out.println(n + " is a circular prime number");
        }
        else {
            System.out.println(n + " is not a circular prime number");
        }

        sc.close();
    }
}
