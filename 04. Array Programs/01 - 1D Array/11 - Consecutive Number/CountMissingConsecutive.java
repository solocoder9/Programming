/*
Example:-
Input: new int[] {5, 10, 15}
Output: 8
Explanation: (6, 7 , 8 ,9, 11, 12, 13, 14)

Input: new int[] {-2, 10, 4}
Output: 10
*/

package Test;

import java.util.Scanner;
import java.util.TreeSet;

public class CountMissingConsecutive {

    // Method to calculate the missing consecutive in an array
    public static int countConsecutive(int[] arr) {
        if (arr.length < 2) {
            return 0;
        }

        TreeSet<Integer> set = new TreeSet<>();
        for (int i : arr) {
            set.add(i);
        }

        return (set.last() - set.first()) - set.size() + 1;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countConsecutive(arr));

        sc.close();
    }
}
