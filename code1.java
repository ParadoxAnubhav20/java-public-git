import java.util.Scanner;
public class code1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter A New Integer:");
        int num = sc.nextInt();
        System.out.println("The Integer:" + num);
        num *= 4;
        System.out.print(num);
        sc.close();
    }
}
