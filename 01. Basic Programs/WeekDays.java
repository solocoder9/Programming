import java.util.Scanner;

public class WeekDays {
    public static void display(int n) {
        switch (n) {
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("thursday");
                break;
            }
            case 5: {
                System.out.println("friday");
                break;
            }
            case 6: {
                System.out.println("Saturday");
                break;
            }
            case 7: {
                System.out.println("Sunday");
                break;
            }
            default: {
                System.out.println("Invalid input");
                break;
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number between 0 to 7: ");
        int n = sc.nextInt();

        display(n);

        sc.close();
    }
}
