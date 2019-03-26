package String;

import java.util.Scanner;

public class StringBfr{
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		String b;
		b=x.nextLine();
		StringBuffer a= new StringBuffer(b);
		StringBuffer c=new StringBuffer("The king");
		System.out.println(c);
		System.out.println(a);
		
		/*StringBuffer e kono function bebohar korar jonno 
		 * extra vabe kono variable declare kora lage na 
		 */
		//jemon
		/*ei khane jekono dhoroner datatype er value string er sathe
		 * add kora jai .append method er maddhome
		 */
		c.append(" Is here");
		System.out.println( c);
		c.setLength(6);
		System.out.println(c);
		c.delete(0, 1);
		System.out.println(c);
		c.reverse();
		System.out.println(c);		
	}
}