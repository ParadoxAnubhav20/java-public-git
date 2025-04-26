public class BinarySearchRecursive{
    // Method to perform binary search recursively
    public static int binarySearch(int[] arr, int target, int start, int end) {
        // Base case: if start crosses end, element not found
        if (start > end) {
            return -1;
        }

        // Calculate the middle index
        int mid = start + (end - start) / 2;

        // If target found at mid, return mid
        if (arr[mid] == target) {
            return mid;
        } 
        // If target is greater than mid element, search in the right half
        else if (target > arr[mid]) {
            return binarySearch(arr, target, mid + 1, end);
        } 
        // If target is smaller than mid element, search in the left half
        else {
            return binarySearch(arr, target, start, mid - 1);
        }
    }

    // Main method to test binary search
    public static void main(String[] args) {
        // Test array
        int[] arr = {1, 5, 9, 11, 15, 16};
        // Element to be searched
        int target = 15;
        
        // Perform binary search and print the result
        int resultIndex = binarySearch(arr, target, 0, arr.length - 1);
        if (resultIndex != -1) {
            System.out.println("Element found at index: " + resultIndex);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
