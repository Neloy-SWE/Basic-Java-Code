package Codes;

import java.util.Scanner;

public class NumberSystem2 {
public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	String s;
	s=x.next();
	int a= Integer.parseInt(s, 2);
	System.out.println("Bainary to desi= "+a);
	s=x.next();
	a= Integer.parseInt(s, 8);
	System.out.println("Octal to desi= "+a);
	s=x.next();
	a= Integer.parseInt(s, 16);
	System.out.println("Hexa to desi= "+a);
}
}
