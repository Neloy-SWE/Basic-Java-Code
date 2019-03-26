package Codes;
import java.util.Scanner;
public class UnaryOperator{
	public static void main(String[]args){
		Scanner x = new Scanner(System.in);
		int a,b,c;
		a=x.nextInt();
		b=++a;
		System.out.printf("%d\n",b);
		c=--a;
		System.out.printf("%d\n",c);
	}
}