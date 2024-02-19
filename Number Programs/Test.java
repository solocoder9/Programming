import java.util.Scanner;

public class Test {
    public static void display(char ch) {
        if(ch == 'A') {
            System.out.println("A is seleted");
        }
        else if(ch == 'B') {
            System.out.println("B is selected");
        }
        else if(ch == 'C') {
            System.out.println("C is selected");
        }
        else if(ch == 'D') {
            System.out.println("D is selected");
        }
        else {
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the options: ");
        char ch = sc.next().charAt(0);

        display(ch);

        sc.close();
        
    }
    
    
}
