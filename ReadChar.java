import java.util.Scanner;
public class ReadChar {
    public static void main(String[] args) {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Word:");
        ch=sc.next().charAt(0);
        System.out.print("Entered Character:"+ch);
        sc.close();
    }
}
