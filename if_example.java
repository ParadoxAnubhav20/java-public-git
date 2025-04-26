import java.util.Scanner;
public class if_example {
    public static void main(String[] args) {
    int num;
    System.out.print("Enter Any Integer:");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    if(num<0){
        System.out.println("The Entered Value is Negative");
    }
    else{
        System.out.println("Entered Values is Positive");
    }
    sc.close();
}
    }
    
