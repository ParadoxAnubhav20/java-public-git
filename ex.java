import java.util.Scanner;

public class ex {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first number:");
        int n1 = scanner.nextInt();
        
        System.out.print("Enter the second number:");
        int n2 = scanner.nextInt();
        
        int sum = n1 + n2;
        int difference = n1 - n2;
        int product = n1 * n2;
        double division = 0.0;
        
        // Check for division by zero before calculating division
        if (n2 != 0) {
            division = (double) n1 / n2;
        } else {
            System.out.println("Cannot divide by zero!");
        }
        
        System.out.println("Hello! We're Learning Java!");
        System.out.println("The Sum is: " + sum);
        System.out.println("The Difference is: " + difference);
        System.out.println("The Product is: " + product);
        
        if (n2 != 0) {
            System.out.println("The Division result is: " + division);
        }
        
        scanner.close();
    }
}
