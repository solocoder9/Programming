// Java program to check the character

import java.util.Scanner;

public class CheckChar {

    // Method to check the character
    public static char checkChar(char ch) {
        if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch+ " is a Uppercase");
            return ch;
        }
        else if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase");
            return ch;
        }

        else if(ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a numeric");
            return ch;
        }

        else{
            System.out.println(ch + " is a special character");
            return ch;
        }

    } 
    
    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = sc.next().charAt(0);

        checkChar(ch);

        sc.close();
    }
}
