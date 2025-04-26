import java.util.Scanner;

public class Fibonacci {
    public static int fibonacciSeries(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciSeries(n - 1) + fibonacciSeries(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int num = scanner.nextInt();
        System.out.println("Fibonacci series:");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacciSeries(i) + " ");
        }
        scanner.close();
    }
}
