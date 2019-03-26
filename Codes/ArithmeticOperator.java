package Codes;
import java.util.Scanner;
public class ArithmeticOperator{
public static void main(String[]args){
	Scanner a=new Scanner(System.in);
	int b,c,d;
	System.out.printf("Enter The 1st number:");
	b=a.nextInt();
	System.out.printf("Enter The 2nd number:");
	c=a.nextInt();
	d=b+c;
	System.out.printf("Sum = %d\n",d);
	d=b-c;
	System.out.printf("Sub = %d\n",d);
	double e=(double)b/c;
	System.out.printf("Div = %.3f\n",e);
	d=b*c;
	System.out.printf("Multi = %d\n",d);
	d=b%c;
	System.out.printf("rev = %d\n",d);
	}
}