import java.util.Scanner;

public class MultiDimensionalArrayTranspose {
    
    // Method to print the elements of a 2D array
    public static void printArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to transpose a 2D array
    public static int[][] transposeArray(int[][] arr){
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] transposed = new int[cols][rows]; // Creating a new array with swapped dimensions
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                transposed[j][i] = arr[i][j]; // Transposing elements
            }
        }
        return transposed;
    }

    public static void main(String[] args) {
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
        System.out.println("Original Array:");
        printArray(arr);
        System.out.println("Transposed Array:");
        int[][] transposed = transposeArray(arr);
        printArray(transposed);
        scanner.close();
    }
}
