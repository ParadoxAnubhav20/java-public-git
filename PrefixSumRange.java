import java.util.Scanner;

public class PrefixSumRange{
    static int[] prefixSum(int[] nums) {
        // Calculate prefix sum
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        // Taking user input for array size and elements
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] arr = new int[size + 1]; // Increase size for 1-based indexing
        System.out.print("Enter the elements separated by space: ");
        for (int i = 1; i <= size; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate prefix sum array
        int[] prefixSumArray = prefixSum(arr);

        // Taking user input for number of queries
        System.out.print("Enter the number of queries: ");
        int q = scanner.nextInt(); // Number of queries

        // Processing queries
        for (int i = 1; i <= q; i++) {
            System.out.print("Enter the range (1-based indexing) separated by space: ");
            int l = scanner.nextInt();
            int r = scanner.nextInt();
            // Calculate sum within the range [l, r]
            System.out.println("Sum within range: " + (prefixSumArray[r] - prefixSumArray[l - 1]));
        }

        scanner.close();
    }
}
