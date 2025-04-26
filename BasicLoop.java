import java.util.*;

public class BasicLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int sum = 0;
        System.out.print("Enter No:");
        int n = sc.nextInt();
        
        // Loop to calculate the sum of even numbers up to n
        while (num <= n) {
            sum += num;
            num += 2;
        }

        // Displaying the sum
        System.out.print("Sum of the Numbers are:" + sum);

        // Closing the scanner
        sc.close();

        System.out.println();
        
        // Additional loop demonstrating break and continue
        for (int i = 0; i < 10; i++) {
            // If i is even, continue to the next iteration
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + i);
            
            // If i reaches 5, break out of the loop
            if (i == 5) {
                System.out.println("Reached 5. Breaking loop.");
                break;
            }
        }
    }
}
