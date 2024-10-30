import java.util.Scanner;
public class LargestBtnTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        // Logic to find largest
        if(a > b) {
            System.out.println("a is largest");
        }
        else {
            System.out.println("b is largest");
        }

        sc.close();
    }
}
