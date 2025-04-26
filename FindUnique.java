public class FindUnique {
    // Method to find the unique element in an array
    static int findUnique(int[] arr) {
        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Compare the current element with all the elements after it
            for (int j = i + 1; j < arr.length; j++) {
                // If two elements are equal, mark both as -1
                if (arr[j] == arr[i]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        // Find and return the first non-marked element (unique)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != -1) {
                return arr[i];
            }
        }
        // If no unique element found, return -1
        return -1;
    }

    public static void main(String[] args) {
        // Test array
        int[] arr = {1, 2, 4, 5, 1, 2, 5};
        // Call findUnique method and print the result
        System.out.println("The unique element is: " + findUnique(arr));
    }
}
