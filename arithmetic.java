import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        int num1, num2;
        System.out.print("Enter The Numbers:");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        num2 = sc.nextInt();
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Addition: " + (num1 + num2));
        sc.close();
    }
}
