import java.util.Scanner;

public class EvenOrOdd {
    public static void checkNumber(int number) {
        if(number % 2 == 0) {
            System.out.println(number + " is an even number");
        }
        else {
            System.out.println(number + " is an odd number");
        }
        
    }
    
    public static void main(String[] arga) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        checkNumber(number);

        sc.close();
    }
}
