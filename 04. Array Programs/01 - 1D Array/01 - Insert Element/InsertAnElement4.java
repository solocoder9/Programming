import java.util.ArrayList;
import java.util.Scanner;

public class InsertAnElement4 {

    // Method to insert an element into an ArrayList at a specific position
    public static void insertArray(ArrayList<Integer> list, int pos, int element) {
        // Validate position
        if (pos < 1 || pos > list.size() + 1) {
            System.out.println("Invalid position! Position must be between 1 and " + (list.size() + 1));
            return;
        }

        // Insert the element at the specified position
        list.add(pos - 1, element);
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the list: ");
        int size = sc.nextInt();

        ArrayList<Integer> list = new ArrayList<>(size);

        System.out.println("Enter the elements of the list: ");
        for (int i = 0; i < size; i++) {
            list.add(sc.nextInt());
        }

        System.out.print("Enter the position to insert at: ");
        int pos = sc.nextInt();

        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        insertArray(list, pos, element);

        // Print the updated list
        for (int i : list) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline at the end

        sc.close();
    }
}
