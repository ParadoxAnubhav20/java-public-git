class ArraySortChecker {
    static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] sampleArray = {5, 9, 15};
        System.out.print("Is the array sorted? " + isSorted(sampleArray));
    }
}
