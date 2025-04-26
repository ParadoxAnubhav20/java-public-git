import java.util.Scanner;
public class unitDigit {
    public static void main(String[] args) {
    int n;
    System.out.print("Enter A Number:");
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int unitDigit=n%10;
    System.out.println("Unit Digit:"+unitDigit);
    sc.close();
    }
}
