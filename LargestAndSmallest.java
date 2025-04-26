import java.util.Arrays;

public class LargestAndSmallest {
    // Method to find the largest and smallest elements in an array
    static int[] findLargestAndSmallest(int[] arr) {
        // Initialize variables to hold the largest and smallest values
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        
        // Iterate through the array to find the largest and smallest values
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is larger
            }
            if (arr[i] < smallest) {
                smallest = arr[i]; // Update smallest if current element is smaller
            }
        }
        
        // Return an array containing the largest and smallest values
        return new int[]{largest, smallest};
    }

    public static void main(String[] args) {
        // Test array
        int[] arr = {2, 1, 9, 8, 7, 156, 12};
        
        // Find the largest and smallest values in the array
        int[] result = findLargestAndSmallest(arr);
        
        // Output the result
        System.out.println("Largest and Smallest elements: " + Arrays.toString(result));
    }
}
