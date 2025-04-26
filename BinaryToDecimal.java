import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.print("Enter A Binary Number:");
        Scanner sc=new Scanner(System.in);
        int binaryNum=sc.nextInt();
        int decimalNum=0;
        int power=1;
        while(binaryNum!=0){
            int parity=binaryNum%2;
            decimalNum+=(parity*power);
            power*=10;
            binaryNum/=10;
        }
        System.out.println("Converted Decimal Number is:"+decimalNum);
        sc.close();
    }
}
