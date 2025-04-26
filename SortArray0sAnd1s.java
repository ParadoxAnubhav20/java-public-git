import java.util.Arrays;

class SortArray0sAnd1s {
    static int[] sortedArray(int[] arr) {
        int size = arr.length;
        int count = 0;

        // Count the number of zeros in the array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }

        // Fill the array with zeros
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }

        // Fill the remaining part of the array with ones
        for (int i = count; i < size; i++) {
            arr[i] = 1;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 0, 1, 0, 0, 0};
        int[] ans = sortedArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
