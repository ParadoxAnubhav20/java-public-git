import java.util.Arrays;

class SortZeoresAndOnesInPlace {
    static int[] sortedArray(int[] arr) {
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==1 && arr[right]==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
            }
        }
        return arr;
    }
    static void swap(int[] arr,int idx1,int idx2){
        int temp=arr[idx1];
        arr[idx1]=arr[idx2];
        arr[idx2]=temp;
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 1, 0, 1, 0, 1, 0, 0, 0};
        int[] ans = sortedArray(nums);
        System.out.println(Arrays.toString(ans));
    }
}
