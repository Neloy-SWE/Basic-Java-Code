package Array;
import java.util.Scanner;
public class ArrayAgain{
	public static void main(String[]args){
		Scanner x= new Scanner(System.in);
		int[][] a=new int[4][4];
		int f=0,i,j;
		for(i=0;i<4;i++){
			for(j=0;j<=i;j++){
				a[i][j]=f;
				f++;
			}
		}
		for(i=0;i<4;i++){
			for(j=0;j<=i;j++){
				System.out.printf("%d	",a[i][j]);
			}
			System.out.println();
		}
		
	}
}