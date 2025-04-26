import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.print("Enter a Decimal Number: ");
        Scanner sc = new Scanner(System.in);
        int decimalNum = sc.nextInt();
        int binaryNum = 0;
        int power = 1;

        while (decimalNum != 0) {
            int remainder = decimalNum % 2;
            binaryNum += remainder * power;
            power *= 10;
            decimalNum /= 2;
        }

        System.out.println("Converted Binary Number is: " + binaryNum);
        sc.close();
    }
}
