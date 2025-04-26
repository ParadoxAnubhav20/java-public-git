import java.util.*;
public class FindSumBrute {
    public static int findsum(int[][] mat,int l1,int r1,int l2,int r2){
        int sum=0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                sum+=mat[i][j];
            }
        }
        return sum;
    }
    public static void arrayInput(int[][] arr) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array Elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        // sc.close();
	}

    public static void displayArray(int[][] arr){
        System.out.print("The Array ELements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter No of Rows and Cols:");
        int r=sc.nextInt();
        int c=sc.nextInt();
        int[][] mat=new int[r][c];
        arrayInput(mat);
        displayArray(mat);
        System.out.print("Enter l1,r1,l2,r2:");
        int l1=sc.nextInt();
        int r1=sc.nextInt();
        int l2=sc.nextInt();
        int r2=sc.nextInt();
        int sum=findsum(mat, l1, r1, l2, r2);
        System.out.println("Rectangle Sum:"+sum);
        sc.close();
    }
}
