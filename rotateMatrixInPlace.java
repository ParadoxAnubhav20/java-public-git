import java.util.Scanner;

public class rotateMatrixInPlace {
    public void rotate(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        // Input matrix from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Perform rotation
        for (int i = 0; i < r; i++) {
            for (int j = i; j < c; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Reverse rows
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c / 2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][c - 1 - j];
                matrix[i][c - 1 - j] = temp;
            }
        }

        // Output rotated matrix
        System.out.println("Rotated matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];

        //solution is the object name
        
        rotateMatrixInPlace solution = new rotateMatrixInPlace();
        solution.rotate(matrix);

        scanner.close();
    }
}
