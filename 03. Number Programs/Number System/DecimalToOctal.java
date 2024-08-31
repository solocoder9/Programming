import java.util.Scanner;

public class DecimalToOctal {

    // Method to convert decimal number to octal
    public static String convertDecimalToOctal(int decimalNum) {
        String octal = "";

        // Convert decimal to octal
        while (decimalNum > 0) {
            octal = (decimalNum % 8) + octal;
            decimalNum /= 8;
        }

        return octal;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the decimal value: ");
        int decimalNum = scanner.nextInt();

        // Convert and print octal value
        System.out.println("Octal value: " + convertDecimalToOctal(decimalNum));

        scanner.close();
    }
}
