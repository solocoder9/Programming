import java.util.Scanner;

public class Vowel {
    public static void display(char ch) {
        switch(ch) {
            case 'a' : {
                System.out.print("vowel");
                break;
            }
            case 'b' : {
                System.out.print("vowel");
                break;
            }
            case 'c' : {
                System.out.print("vowel");
                break;
            }
            case 'd' : {
                System.out.print("vowel");
                break;
            }
            case 'e' : {
                System.out.print("vowel");
                break;
            }
            default : {
                System.out.print("consonants");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any alphabate: ");
        char ch = sc.next().charAt(0);

        display(ch);

        sc.close();
    }
}
