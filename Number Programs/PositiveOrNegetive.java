import java.util.Scanner;

class PositiveOrNegetive {
    public static void checkNumber(int number) {
        if(number > 0) {
            System.out.println(number + " is a positive number");
        }
        else if (number < 0) {
            System.out.println(number + " is a negative number");
        }
        else {
            System.out.println("Number is zero");
        }
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int number = sc.nextInt();

        checkNumber(number);

        sc.close();
    }
}
