import java.util.Scanner;

public class DecimalToHexadecimal {

    // Method to convert decimal number to hexadecimal
    public static String convertDecimalToHexadecimal(int decimalNum) {

        String hexa = "";

        while (decimalNum > 0) {
            int rem = decimalNum % 16;

            if (rem == 10) {
                hexa = "A" + hexa;
            } else if (rem == 11) {
                hexa = "B" + hexa;
            } else if (rem == 12) {
                hexa = "C" + hexa;
            } else if (rem == 13) {
                hexa = "D" + hexa;
            } else if (rem == 14) {
                hexa = "E" + hexa;
            } else if (rem == 15) {
                hexa = "F" + hexa;
            } else {
                hexa = rem + hexa;
            }

            decimalNum /= 16;
        }

        return hexa;
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the decimal value: ");
        int decimalNum = sc.nextInt();

        // Convert and print hexadecimal value
        System.out.println("Hexadecimal value: " + convertDecimalToHexadecimal(decimalNum));

        sc.close();
    }
}
