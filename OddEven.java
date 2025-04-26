import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter an integer
        System.out.print("Enter an Integer:");
        num = sc.nextInt();

        // Check if the number is even using if-else statement
        if (num % 2 == 0) {
            System.out.println("Using if-else statement: Even Number");
        } else {
            System.out.println("Using if-else statement: Odd Number");
        }

        // Check if the number is even using ternary operator
        String ans = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println("Using ternary operator: " + ans);

        sc.close(); // Close the scanner
    }
}
