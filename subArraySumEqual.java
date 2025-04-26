import java.util.*;

public class subArraySumEqual{

    // Function to calculate the total sum of elements in an array
    static int calculateTotalSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Function to check if an array can be partitioned into two subarrays with equal sum
    static boolean hasEqualSumPartition(int[] nums) {
        int totalSum = calculateTotalSum(nums);
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum == totalSum - currentSum) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] nums = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Entered Array: " + Arrays.toString(nums));
        System.out.println("Can the array be partitioned into two subarrays with equal sum? " + hasEqualSumPartition(nums));
        sc.close();
    }
}
