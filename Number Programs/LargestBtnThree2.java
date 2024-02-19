import java.util.Scanner;

public class LargestBtnThree2 {
    public static int findLargest(int a, int b, int c) {
        if(a > b && a > c) {
            System.out.println(a + " a is largest");
            return a;
        }
        else if(b > c) {
            System.out.println(b + " b is largest");
            return b;
        }
        else {
            System.out.println(c + " c is largest");
            return c;
        }
    } 
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of a, b and c: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        findLargest(a, b, c);

        sc.close();
    }
}
