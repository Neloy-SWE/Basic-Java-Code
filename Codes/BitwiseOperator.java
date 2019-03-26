package Codes;
import java.util.Scanner;
public class BitwiseOperator{
	public static void main(String[]args) {
		Scanner x=new Scanner(System.in);
		int a,b,c;
		a=x.nextInt();
		b=x.nextInt();
		c=a&b;
		System.out.printf("AND %d\n",c);
		c=a|b;
		System.out.printf("OR %d\n",c);
		c=a^b;
		System.out.printf("EXOR %d\n",c);
		c=a>>2;
		System.out.printf("S R %d\n",c);
		c=a<<2;
		System.out.printf("S L %d\n",c);
	}
}