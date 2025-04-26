import java.util.Scanner;

public class factorialLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            System.out.print(fact + " ");
        }
        System.out.println();
        System.out.println("Final Factorial Value: " + fact);
        sc.close();
    }
}
