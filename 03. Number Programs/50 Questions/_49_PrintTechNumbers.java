package Test;

public class _49_PrintTechNumbers {

    // Method to print 4-digit Tech numbers
    public static void printTechNumbers() {
        for (int number = 1000; number <= 9999; number++) {
            if (isTechNumber(number)) {
                System.out.print(number + " ");
            }
        }
    }

    // Helper method to check whether a number is a Tech number
    public static boolean isTechNumber(int n) {
        if ((n + "").length() % 2 != 0) {
            return false;
        }

        int numDigits = (n + "").length();

        // Split the number into two equal parts
        int leftHalf = n / (int) Math.pow(10, numDigits / 2);
        int rightHalf = n % (int) Math.pow(10, numDigits / 2);

        int sumOfHalves = leftHalf + rightHalf;

        // Calculate the square of the sum of two parts
        int squaredSum = sumOfHalves * sumOfHalves;

        return n == squaredSum;
    }

    // Driver code
    public static void main(String[] args) {
        printTechNumbers();
    }
}
