public class PairSumFinder {

    // Function to find the count of pairs in the array that sum up to the target
    static int countPairsWithSum(int[] array, int targetSum) {
        int count = 0;

        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Loop through each element after the current element
            for (int j = i + 1; j < array.length; j++) {
                // Check if the sum of the current pair equals the target sum
                if (array[i] + array[j] == targetSum) {
                    // Increment count if the sum matches the target
                    count++;
                }
            }
        }
        return count; // Return the total count of pairs
    }

    public static void main(String[] args) {
        // Sample array and target sum
        int[] array = {2, 1, 5, 6, 9, 4, 0, 3, 7};
        int targetSum = 6;

        // Find and display the total count of pairs with the given sum
        System.out.println("Total Pairs: " + countPairsWithSum(array, targetSum));
    }
}
