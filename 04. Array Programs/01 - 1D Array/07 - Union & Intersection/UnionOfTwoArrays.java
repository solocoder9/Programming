import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoArrays {

	// Method to get the union of two sorted arrays
	public static int[] unionArrays(int[] arr1, int[] arr2) {
		Set<Integer> union = new HashSet<>();

		for (int i = 0; i < arr1.length; i++) {
			union.add(arr1[i]);
		}

		for (int i = 0; i < arr2.length; i++) {
			union.add(arr2[i]);
		}

		// Convert Set to int[]
		int[] result = new int[union.size()];
		int index = 0;
		for (Integer num : union) {
			result[index++] = num;
		}

		return result;
	}

	// Driver code
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// For first array
		System.out.print("Enter the size of array1: ");
		int size1 = sc.nextInt();
		int[] arr1 = new int[size1];
		System.out.print("Enter elements of array1: ");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = sc.nextInt();
		}

		// For second array
		System.out.print("Enter the size of array2: ");
		int size2 = sc.nextInt();
		int[] arr2 = new int[size2];
		System.out.print("Enter elements of array2: ");
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}

		// Union two arrays
		int[] union = unionArrays(arr1, arr2);

		System.out.print("Union of the two arrays: ");
		for (int i : union) {
			System.out.print(i + " ");
		}

		sc.close();
	}
}
