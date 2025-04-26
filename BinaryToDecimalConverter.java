// Importing Scanner class to read input from the user
import java.util.Scanner;

// Main class definition
public class BinaryToDecimalConverter {
    // Main method
    public static void main(String[] args) {
        // Creating Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompting the user to enter a binary number
        System.out.print("Enter a binary number:");

        // Reading the binary number input from the user
        int binaryNum = scanner.nextInt();

        // Initializing variables for decimal conversion
        int decimalNum = 0;
        int power = 1;

        // Converting binary to decimal
        while (binaryNum > 0) {
            // Extracting the rightmost digit of the binary number
            int unitDigit = binaryNum % 10;
            
            // Adding the contribution of the current binary digit to the decimal number
            decimalNum += unitDigit * power;
            
            // Removing the rightmost digit from the binary number
            binaryNum /= 10;
            
            // Updating the power of 2 for the next binary digit
            power *= 2;
        }
        
        // Displaying the decimal equivalent of the binary number
        System.out.print("Decimal equivalent: " + decimalNum);

        scanner.close();
    }
}
