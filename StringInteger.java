import java.util.*;
public class StringInteger{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        int i1=Integer.parseInt(s1);
        int i2=Integer.parseInt(s2);
        System.out.println(i1+i2);
        sc.close();
    }
}