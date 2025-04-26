import java.util.Scanner;
public class takingInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        System.out.print("Enter An Integer:");
        num=sc.nextInt();
        System.out.print("Value of the Integer Variable:"+num);
        sc.close();
}
}