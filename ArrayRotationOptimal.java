import java.util.Arrays;

public class ArrayRotationOptimal {
    // Method to reverse the array
    static void reverse(int[] array, int start, int end) {
        // Reverses the subarray from 'start' to 'end' inclusive
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    // Method to rotate the array by k steps
    static void rotate(int[] array, int k) {
        int n = array.length;
        k = k % n; // Adjusting k if it's greater than array length

        // Rotate the first part of the array
        reverse(array, 0, n - k - 1);
        // Rotate the second part of the array
        reverse(array, n - k, n - 1);
        // Rotate the whole array
        reverse(array, 0, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println("Original Array: " + Arrays.toString(arr));
        rotate(arr, k);
        System.out.println("Rotated Array by " + k + " steps: " + Arrays.toString(arr));
    }
}
