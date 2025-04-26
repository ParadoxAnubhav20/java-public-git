import java.util.Scanner;

public class rotateRightOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int originalNumber = scanner.nextInt();

        int lastDigit = originalNumber % 10;
        int remainingNumber = originalNumber / 10;
        int tempNumber = remainingNumber; // Copy of remainingNumber to calculate digits
        
        int numberOfDigits = 0;
        while (tempNumber != 0) {
            numberOfDigits++;
            tempNumber /= 10;
        }
        
        int rotatedNumber = lastDigit * (int)Math.pow(10, numberOfDigits) + remainingNumber;
        System.out.println("Original number:" + originalNumber);
        System.out.println("Rotated number:" + rotatedNumber);

        scanner.close();
    }
}
