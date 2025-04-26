public class CountOccurrences {
    static int countOccurrences(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {5, 7, 1, 5, 3, 4, 9, 5};
        int key = 5;
        System.out.println("Count: " + countOccurrences(a, key));
    }
}
