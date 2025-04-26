import java.util.Scanner;

public class Greeting {
    static void welcome(String name) {
        System.out.println("Welcome " + name);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        welcome(name);
        scanner.close();
    }
}