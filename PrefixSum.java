import java.util.*;

public class PrefixSum {
    static int[] prefixSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Array: " + Arrays.toString(arr));

        int[] ans = prefixSum(arr);

        System.out.println("Prefix Sum Array: " + Arrays.toString(ans));

        sc.close();
    }
}
