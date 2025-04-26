import java.util.*;

public class Searchin2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number of Rows and Columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        if(rows <= 0 || cols <= 0) {
            System.out.println("Invalid input. Number of rows and columns should be positive integers.");
            sc.close();
            return; // Exit the program
        }
        
        int[][] arr = new int[rows][cols];
        System.out.println("Enter The Matrix Elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Entered Matrix");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
        System.out.print("Enter element to find:");
        int target = sc.nextInt();
        int[] ans = searchInMatrix(arr, target);
        
        if (ans[0] == -1 && ans[1] == -1) {
            System.out.println("Element not found in the matrix.");
        } else {
            System.out.println("Element found at position: (" + ans[0] + ", " + ans[1] + ")");
        }
        
        sc.close();
    }

    static int[] searchInMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
