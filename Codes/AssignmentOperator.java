package Codes;
import java.util.Scanner;
public class AssignmentOperator{
	public static void main(String[]arg){
		Scanner a = new Scanner(System.in);
		int c,b;
		c=a.nextInt();
		b=a.nextInt();
		c-=b;
		System.out.printf("%d\n",c);
		c-=b;
		System.out.printf("%d\n",c);
		c*=b;
		System.out.printf("%d\n",c);
		c/=b;
		System.out.printf("%d\n",c);
		c%=b;
		System.out.printf("%d\n",c);
	}
}