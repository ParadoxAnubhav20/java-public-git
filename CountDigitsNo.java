import java.util.*;
class CountDigitsNo {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter an Integer:");
        num=sc.nextInt();
        sc.close();
        int digits=countDigits(num);
        System.out.print("Total no of digits:"+digits);
    }
    public static int countDigits(int num){
        int temp=num;
        int count=0;
        while(temp!=0){
            count++;
            temp/=10;
        }
        return count;
    }
}