// program to calculate the nth term in a Geometric Progression

import java.util.Scanner;

public class NthTermInGP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of the first term a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of the common ratio r: ");
        int r = sc.nextInt();

        System.out.print("Enter the value of term n: ");
        int n = sc.nextInt();

        // Calculate the nth term in the GP(Geometric Progression)
        // Using Math.pow() fungction to raise r to the power of (n - 1)
        // And type cast to integer
        int nthTerm = a * (int)Math.pow(r, (n - 1));

        System.out.println("The " + n +"th term in the GP is: " + nthTerm);

        sc.close();
    }    
}
