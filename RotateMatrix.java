import java.util.Scanner;
public class RotateMatrix {

	public static void arrayInput(int[][] arr) {
        Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Array Elements:");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
        sc.close();
	}

    public static void displayArray(int[][] arr){
        System.out.print("The Array ELements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }System.out.println();
        }
    }

    public static int[][] rotatedMatrix(int[][] mat){
        int[][] ans = new int[mat[0].length][mat.length];
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[i].length; j++){
                ans[j][mat.length - 1 - i] = mat[i][j];
            }
        }
        return ans;
    }
    
	
	public static void main(String[] args) {
		System.out.print("Enter Row and Column No:");
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int col=sc.nextInt();
		int[][] mat=new int[row][col];
        arrayInput(mat);
        displayArray(mat);
        int[][] ans=new int[row][col];
        ans=rotatedMatrix(mat);
        displayArray(ans);
		sc.close();
	}

}
