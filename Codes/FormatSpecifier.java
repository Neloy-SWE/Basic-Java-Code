package Codes;

public class FormatSpecifier {

	public static void main(String[] args) {
		boolean b;
		short s;
		int i;
		float f;
		double d;
		char c;
		byte t;
		long l;
		
		b=false;
		s=10000;
		i=23746;
		f=23.3f;
		d=238.093;
		c='N';
		t=123;
		l=765432123;
		
		System.out.printf("boolean = %b\n",b);
		System.out.printf("Short = %d\n",s);
		System.out.printf("int = %d\n",i);
		System.out.printf("Float = %.2f\n",f);
		System.out.printf("Double = %.3f\n",d);
		System.out.printf("Charecter = %c\n",c);
		System.out.printf("Byte = %d\n",t);
		System.out.printf("Long = %d\n",l);

	}

}
