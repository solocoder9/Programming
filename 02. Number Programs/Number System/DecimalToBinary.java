import java.util.Scanner;

public class DecimalToBinary {

    // Method to convert the decimal number to binary
    public static String convertDecimalToBinary(int decimalNum) {

        String binary = "";

        while (decimalNum > 0) {
            binary = (decimalNum % 2) + binary;
            decimalNum /= 2;
        }

        return binary;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Decimal value: ");
        int decimalNum = sc.nextInt();

        // Convert and print binary value
        System.out.println("Binary value: " + convertDecimalToBinary(decimalNum));

        sc.close();
    }
}
