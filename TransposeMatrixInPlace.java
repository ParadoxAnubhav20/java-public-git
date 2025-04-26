import java.util.Scanner;

public class TransposeMatrixInPlace {

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number of rows and columns
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        // Create matrix
        int[][] matrix = new int[rows][cols];

        // Input matrix elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        displayMatrix(matrix);

        // Transpose the matrix
        transposeMatrix(matrix);

        // Display the transposed matrix
        displayMatrix(matrix);

        scanner.close();
    }

    // Method to transpose the matrix
    public static void transposeMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                // Swap elements
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Method to display the matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
