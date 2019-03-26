package String;

import java.util.Scanner;

public class Palindrom {
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	String a;
	a=x.nextLine();
	StringBuffer c=new StringBuffer(a);
	System.out.println(c);
	StringBuffer d=new StringBuffer();
	d=c.reverse();
	System.out.println(d);
	if(c==d){
		System.out.println("palindrom");
	}
	else {
		System.out.println("Not palindrom");
	}
}
}
