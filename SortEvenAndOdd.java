import java.util.Arrays;

public class SortEvenAndOdd {
    
    // Function to sort an array such that even numbers come before odd numbers
    static int[] sortEvenBeforeOdd(int[] arr) {
        int left = 0; // Pointer for the left end of the array
        int right = arr.length - 1; // Pointer for the right end of the array
        
        // Loop until the two pointers meet
        while (left < right) {
            // If the element at the left pointer is odd and the element at the right pointer is even, swap them
            if (arr[left] % 2 != 0 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++; // Move the left pointer to the right
                right--; // Move the right pointer to the left
            }
            
            // If the element at the left pointer is even, move the left pointer to the right
            if (arr[left] % 2 == 0) {
                left++;
            }
            
            // If the element at the right pointer is odd, move the right pointer to the left
            if (arr[right] % 2 != 0) {
                right--;
            }
        }
        return arr;
    }
    
    // Function to swap elements at given indices in an array
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {11, 12, 14, 15, 19, 22, 23, 26};
        int[] sortedArray = sortEvenBeforeOdd(nums);
        System.out.println("Sorted Array with Even Numbers Before Odd Numbers: " + Arrays.toString(sortedArray));
    }
}
