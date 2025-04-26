import java.util.*;
public class FactorialSample {
    public static void main(String[] args) {
        int[] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println(factorial(arr[i]));
        }
        sc.close();
    }
    public static int factorial(int num){
        if(num<2){
            return 1;
        }
        else{
            return num*factorial(num-1);
        }
    }
}
