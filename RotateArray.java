import java.util.Arrays;

public class RotateArray {
    // Method to rotate an array to the right by k steps
    public static int[] rotateArray(int[] arr, int k) {
        int n = arr.length;
        // Adjusting k to avoid unnecessary rotations
        k = k % n;
        // Initializing a new array to store the rotated elements
        int[] rotated = new int[n];
        int j = 0;

        // Copying elements from the original array to the rotated array from n-k to n-1
        for (int i = n - k; i < n; i++) {
            rotated[j++] = arr[i];
        }

        // Copying remaining elements from the original array to the rotated array from 0 to n-k-1
        for (int i = 0; i < n - k; i++) {
            rotated[j++] = arr[i];
        }

        // Returning the rotated array
        return rotated;
    }

    public static void main(String[] args) {
        // Example input array
        int[] originalArray = {8, 1, 2, 5, 6, 9, 0, 4};
        
        int steps = 3;

        // Printing the original array
        System.out.println("Original Array: " + Arrays.toString(originalArray));

        // Rotating the original array by specified steps
        int[] rotatedArray = rotateArray(originalArray, steps);

        // Printing the rotated array
        System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
    }
}
