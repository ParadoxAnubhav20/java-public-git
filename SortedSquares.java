import java.util.Arrays;

public class SortedSquares{
    static public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        
        while (left <= right) {
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];
            
            if (leftSquare > rightSquare) {
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        
        return result;
    }
    public static void main(String[] args) {
        // Test Case 1
        int[] nums1 = {-4, -1, 0, 3, 10};
        int[] result1 = sortedSquares(nums1);
        System.out.println("Sorted Squares of nums1: " + Arrays.toString(result1));

        // Test Case 2
        int[] nums2 = {-7, -3, 2, 3, 11};
        int[] result2 = sortedSquares(nums2);
        System.out.println("Sorted Squares of nums2: " + Arrays.toString(result2));
    }
}
