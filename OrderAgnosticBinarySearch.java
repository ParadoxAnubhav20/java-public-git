public class OrderAgnosticBinarySearch {
    
    // Function to perform order-agnostic binary search
    public static int orderAgnosticBinarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        
        // Checking whether the array is in ascending or descending order
        boolean isAscending = arr[start] < arr[end];
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (isAscending) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1; // Element not found
    }
    
    // Example usage
    public static void main(String[] args) {
        int[] ascendingArr = {1, 3, 5, 7, 9, 11, 13};
        int[] descendingArr = {13, 11, 9, 7, 5, 3, 1};
        
        int target = 7;
        
        int ascIndex = orderAgnosticBinarySearch(ascendingArr, target);
        int descIndex = orderAgnosticBinarySearch(descendingArr, target);
        
        System.out.println("Element " + target + " found at index in ascending order: " + ascIndex);
        System.out.println("Element " + target + " found at index in descending order: " + descIndex);
    }
}
