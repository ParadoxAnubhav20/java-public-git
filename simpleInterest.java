import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p, r;
        int t;
        System.out.print("Enter Principle Amount: ");
        p = sc.nextFloat();
        System.out.print("Enter Rate of Interest: ");
        r = sc.nextFloat();
        System.out.print("Enter Time (In Years): ");
        t = sc.nextInt();
        float interest = (p * t * r) / 100;
        System.out.println("Principle: " + p + "\n" + "Rate of Interest: " + r + "\n" + "Time: " + t);
        System.out.println("Total Interest: " + interest);
        sc.close();
    }
}
