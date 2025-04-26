import java.util.Scanner;

class Multiples {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number to print its Multiplication table: ");
        num = sc.nextInt();

        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }

        sc.close();
    }
}
