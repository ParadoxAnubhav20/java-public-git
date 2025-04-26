import java.util.Scanner;

public class LoopRecursion {
    public static void main(String[] args) {
        // Prompt the user to enter a positive integer
        System.out.print("Enter A Positive Integer:");
        Scanner sc = new Scanner(System.in);        
        int num = sc.nextInt();
        
        // Print the Fibonacci sequence up to the entered number
        printRange(num);
        
        // Close the scanner to prevent resource leak
        sc.close();
    }

    // Method to calculate the Fibonacci number using recursion
    public static int fibonacci(int num) {
        // Base cases: if num is 0 or 1, return num
        if (num == 0 || num == 1) {
            return num;
        }
        // Recursive case: sum of the previous two Fibonacci numbers
        return fibonacci(num - 1) + fibonacci(num - 2);
    }

    // Method to print the Fibonacci sequence up to the given number
    public static void printRange(int num) {
        // Loop from 0 to the given number (inclusive)
        for (int i = 0; i <= num; i++) {
            // Print the Fibonacci number for each index
            System.out.print(fibonacci(i) + " ");
        }
        // Print a new line after the sequence
        System.out.println();
    }
}
