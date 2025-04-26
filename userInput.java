import java.util.Scanner;

public class userInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter a Decimal: ");
        float num2 = scanner.nextFloat();

        double answer = num1 * num2;
        System.out.println("Answer: " + answer);

        scanner.close();
    }
}
