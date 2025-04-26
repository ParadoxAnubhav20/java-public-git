import java.util.Scanner;
public class MultiDimesionalArrayAddition{
    // Method to print a 2D array
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
    // Method to take input for a 2D array
    public static int[][] takeInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] arr = new int[rows][columns];
        System.out.println("Enter array elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        return arr;
    }
    // Method to add two 2D arrays
    public static int[][] arrayAddition(int[][] arr, int[][] brr) {
        int rows = arr.length;
        int cols = arr[0].length; // Assuming all rows have the same number of columns
        int[][] ans = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[i][j] = arr[i][j] + brr[i][j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input for the first array
        System.out.println("Enter the elements for the first array:");
        int[][] arr = takeInput();
        // Taking input for the second array
        System.out.println("Enter the elements for the second array:");
        int[][] brr = takeInput();
        // Displaying the first array
        System.out.println("First Array:");
        printArray(arr);
        // Displaying the second array
        System.out.println("Second Array:");
        printArray(brr);
        // Adding the two arrays
        int[][] sum = arrayAddition(arr, brr);
        System.out.println("Sum of the arrays:");
        printArray(sum);
        scanner.close();
    }
}
