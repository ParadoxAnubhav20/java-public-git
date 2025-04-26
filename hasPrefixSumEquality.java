public class hasPrefixSumEquality{
    static boolean HasPrefixSumEquality(int[] nums) {
        int[] prefixSums = new int[nums.length];
        prefixSums[0] = nums[0];
        
        // Calculate prefix sums
        for (int i = 1; i < nums.length; i++) {
            prefixSums[i] = prefixSums[i - 1] + nums[i];
        }
        
        int totalSum = prefixSums[nums.length - 1];
        
        // Check for prefix sum equality
        for (int i = 0; i < nums.length - 1; i++) {
            if (prefixSums[i] == totalSum - prefixSums[i]) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] arr = {5, 3, 2, 6, 3, 1};
        System.out.println("Does the array have a prefix sum equality? " + HasPrefixSumEquality(arr));
    }
}
