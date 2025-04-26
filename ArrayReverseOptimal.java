import java.util.Arrays;

public class ArrayReverseOptimal {
    // Method to reverse the array
    static int[] reverseArray(int[] array) {
       int start = 0;
       int end = array.length - 1;
       while (start <= end) {
           swap(array, start, end);
           start++;
           end--;
       }
       return array;
    }
    
    // Method to swap elements
    static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] originalArray = {3, 4, 1, 6, 8, 2};
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        int[] reversedArray = reverseArray(originalArray);
        
        // Displaying original and reversed arrays
        System.out.println("Reversed Array: " + Arrays.toString(reversedArray));
    }
}
