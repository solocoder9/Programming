import java.util.Scanner;

public class LargestBtnThree2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        // Logic to find largest
        if(a > b) {
            if(a > c) {
                System.out.println("a is Greatest");
            }
            else {
                System.out.println("c is Greatest");
            }
        }
        else {
            if(b > c) {
                System.out.println("b is Greatest");
            }
            else {
                System.out.println("c is Greatest");
            }
        }

        sc.close();
    }
}
