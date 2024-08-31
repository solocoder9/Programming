// Replace XYZ with a meaningful package name

import java.util.Scanner;

public class DecimalToBinary {

    // Method to convert a decimal to binary number
    public static String convertDecimalToBinary(int decimalNumber) {
        String binaryString = "";
        while (decimalNumber > 0) {
            binaryString = decimalNumber % 2 + binaryString;
            decimalNumber /= 2;
        }
        return binaryString;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        System.out.println("Binary equivalent of " + decimalNumber + " is: " + convertDecimalToBinary(decimalNumber));

        scanner.close();
    }
}
