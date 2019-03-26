package Codes;

import java.util.Scanner;

public class NumberSystem {
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	int a;
	System.out.print("Input=");
	a=x.nextInt();
	System.out.println("Desimal="+a);
	String b=Integer.toBinaryString(a);
	System.out.println("Binary="+b);
	b=Integer.toOctalString(a);
	System.out.println("Octal="+b);
	b=Integer.toHexString(a);
	System.out.println("Hexadecimal="+b);
}
}
