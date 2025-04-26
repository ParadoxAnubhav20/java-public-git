public class SecondLargest {
    // Method to find the second largest element in an array
    static int findSecondLargest(int[] arr){
        int max = Integer.MIN_VALUE; // Initialize maximum value to the smallest possible integer
        int secondMax = Integer.MIN_VALUE; // Initialize second maximum value to the smallest possible integer
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondMax = max; // Store the previous max as secondMax
                max = arr[i]; // Update max with the new maximum value
            } else if(arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i]; // Update secondMax if current element is greater and not equal to max
            }
        }
        return secondMax; // Return the second maximum element
    }

    public static void main(String[] args) {
        // Test array
        int[] arr = {1, 6 ,9 ,12 ,7 , 10 ,3};
        // Call findSecondLargest method and print the result
        System.out.println("The second largest element is: " + findSecondLargest(arr));
    }
}
