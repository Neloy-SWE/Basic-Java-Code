package String;

public class String2 {
public static void main(String[] args) {
	String a= "Neloy ";
	String b= "Is the boss";
	String c=a+b;
	System.out.println(c);
	System.out.println("Use of .concat method:");
	String d=a.concat(b);
	System.out.println(d);
	System.out.println("Use of .toUpperCase method:");
	String e=d.toUpperCase();
	System.out.println(e);
	System.out.println("Use of .toLowerCase method");
	String f=e.toLowerCase();
	System.out.println(f);
	System.out.println("Use of .startWith and .endWith method:");
	boolean g,h;
	g=a.startsWith("N");
	h=e.endsWith("s");
	System.out.println(g);
	System.out.println(h);
	
}
}
