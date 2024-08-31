// Program to check the number is Perfect or not
// Example 28 | factors/ divisors = 1, 2, 4, 7, 14
// sum of the factors 1 + 2 + 4 + 7 + 14 = 28

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        int factorSum = 0;

        for(int i = 1; i <= number/2; i++) {
            if(number % i == 0) {
                factorSum += i;
            }
        }

        if(factorSum == number) {
            System.out.println(number + " is a Perfect number");
        }
        else {
            System.out.println(number + " is not a Perfect number");
        }

        sc.close();
    }    
}
