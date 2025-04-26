import java.util.Scanner;

public class IfExample {
    public static void main(String[] args) {
        int num;
        System.out.print("Enter any integer: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        if (num < 0) {
            System.out.println("The entered value is Negative");
        } else {
            System.out.println("The entered value is Positive");
        }
        String ans;
        ans = ((num % 2 == 0) ? "Even" : "Odd");
        System.out.println("The Entered Value is:" + ans);
        sc.close();
    }
}
