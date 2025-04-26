public class SelectionSort {
    public static void sort(int[] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minIdx = i;
            for(int j = i + 1; j < arr.length; j++){  // Corrected increment variable from i to j
                if(arr[j] < arr[minIdx]){
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void display(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 3};
        System.out.println("Original array:");
        display(arr);
        sort(arr);
        System.out.println("Sorted array:");
        display(arr);
    } 
}
