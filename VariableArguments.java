public class VariableArguments {
    public static void main(String[] args) {
        printArgumentsSum(1, 2, 4, 5);   
        printArgumentsSum();            
        printArgumentsSum(10, -10);    
    }

    public static void printArgumentsSum(int... nums) {
        if (nums.length == 0) {
            System.out.println("No numbers provided.");
            return;
        }
        
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        
        System.out.println("Sum: " + sum);
    }
}
