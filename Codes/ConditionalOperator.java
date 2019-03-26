package Codes;
import java.util.Scanner;
public class ConditionalOperator{
	public static void main(String[]args){
		Scanner x=new Scanner (System.in);
		int a,b,large;
		a=x.nextInt();
		b=x.nextInt();
		large=(a>b)?a:b;
		System.out.printf("Large %d\n",large);
	}
}