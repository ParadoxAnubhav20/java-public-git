import java.util.Scanner;

public class MatrixPrefixSum {
    public static void calculatePrefixSum(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
    }

    public static int findSubMatrixSum(int[][] matrix, int topLeftRow, int topLeftCol, int bottomRightRow, int bottomRightCol) {
        int sum = 0;
        calculatePrefixSum(matrix);
        for (int i = topLeftRow; i <= bottomRightRow; i++) {
            sum += (matrix[i][bottomRightCol] - (topLeftCol > 0 ? matrix[i][topLeftCol - 1] : 0));
        }
        return sum;
    }

    public static void inputArray(int[][] array) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }

    public static void displayArray(int[][] array) {
        System.out.println("The array elements are:");
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();
        int[][] matrix = new int[rows][cols];
        inputArray(matrix);
        displayArray(matrix);
        System.out.print("Enter top-left row, top-left column, bottom-right row, and bottom-right column: ");
        int topLeftRow = scanner.nextInt();
        int topLeftCol = scanner.nextInt();
        int bottomRightRow = scanner.nextInt();
        int bottomRightCol = scanner.nextInt();
        int sum = findSubMatrixSum(matrix, topLeftRow, topLeftCol, bottomRightRow, bottomRightCol);
        System.out.println("Rectangle sum: " + sum);
        scanner.close();
    }
}
