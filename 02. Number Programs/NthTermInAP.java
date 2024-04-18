// Program to calculate the nth term in an Arithmetic Progression

import java.util.Scanner;

public class NthTermInAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of the first term a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of the common difference d: ");
        int d = sc.nextInt();

        System.out.print("Enter the value of term n: ");
        int n = sc.nextInt();

        // Calculate the nth term in the AP(Arithmetic Progression)
        int nthTerm = a + ((n -1) * d);

        System.out.println("The "+ n + "th term in the AP is: " + nthTerm);

        sc.close();
    }    
}
