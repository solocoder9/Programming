import java.util.Scanner;

public class Calculator {
    public static void cal(int a, int b, char ch) {
        int result;

        switch(ch) {
            case '+' : {
                result = a + b;
                System.out.println(result);
                break;
            }
            case '-' : {
                result = a - b;
                System.out.println(result);
                break;
            }
            case '*' : {
                result = a * b;
                System.out.println(result);
                break;
            }
            case '/' : {
                result = a + b;
                System.out.println(result);
                break;
            }
            default : {
                System.out.println("Invalid input");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value a: ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();

        System.out.print("Enter operator between +, -, *, / : ");
        char ch = sc.next().charAt(0);

        cal(a, b, ch);

        sc.close();

    }
}
