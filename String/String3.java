package String;

public class String3 {
public static void main(String[] args) {
	String a= "               Neloy is the Boss\n\n\n";
	System.out.println(a);
System.out.println("Use of .charAt method to know the position of any charecter");
	char ch=a.charAt(9);
	System.out.println(ch);
	System.out.println("codePointAt method for Ascii value");
	int b=a.codePointAt(9);
	System.out.println(b);
	System.out.println("indexOf method for index number");
	int c=a.indexOf('s');
	System.out.println(c);
	System.out.println("lastIndexOf method for index number");
	c=a.lastIndexOf('s');
	System.out.println(c);
	System.out.println("trim method for clear the space");
	String n=a.trim();
	System.out.println(n);
}
}
