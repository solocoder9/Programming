import java.util.Scanner;

public class MakeBricks {
    
    public static boolean makeBricks(int small, int big, int goal) {

        int totalLength = small + big * 5;
        if(totalLength < goal) {
            return false;
        }

        int bigNeeded = goal / 5;
        int smallNeeded = goal - bigNeeded * 5;
        
        return smallNeeded <= small;
    }

    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of small: ");
        int small = sc.nextInt();

        System.out.print("Enter the value of big: ");
        int big = sc.nextInt();

        System.out.print("Enter the value of goal: ");
        int goal = sc.nextInt();

        System.out.println(makeBricks(small, big, goal));

        sc.close();
    }
}
