import java.util.Arrays;

public class MergeSort {

    // Method to merge two halves of the array
    public static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;  // Length of the left subarray
        int n2 = r - mid;      // Length of the right subarray

        // Create temporary arrays to hold the elements of the subarrays
        int[] left = new int[n1];
        int[] right = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }

        // Merge the temporary arrays back into the original array
        int i = 0, j = 0;  // Initial indexes of the left and right subarrays
        int k = l;  // Initial index of the merged subarray

        // Merge the arrays while there are elements in both subarrays
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];  // Take element from left subarray
            } else {
                arr[k++] = right[j++];  // Take element from right subarray
            }
        }

        // Copy the remaining elements of the left subarray, if any
        while (i < n1) {
            arr[k++] = left[i++];
        }

        // Copy the remaining elements of the right subarray, if any
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    // Method to sort the array using merge sort algorithm
    public static void mergeSort(int[] arr, int l, int r) {
        // Base case: If the subarray has one or zero elements, it's already sorted
        if (l >= r) {
            return;
        }

        // Find the middle point to divide the array into two halves
        int mid = l + (r - l) / 2;

        // Recursively sort the first and second halves
        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // Merge the sorted halves
        merge(arr, l, mid, r);
    }

    public static void main(String[] args) {
        int[] arr = {4, 9, 2, 0, 8, 1, -1, 5, 3};  // Example array to sort
        System.out.println("Before sorting: " + Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);  // Sort the array
        System.out.println("After sorting: " + Arrays.toString(arr));
    }
}
