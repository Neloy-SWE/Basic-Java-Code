package Codes;

import java.util.Scanner;

public class WhileLoop{
	public static void main (String[]arggs) {
		Scanner x= new Scanner(System.in);
		int i=1,n;
		n=x.nextInt();
		while ( i<=n) {
			System.out.printf("%d Neloy is back on java programming\n",i);
		i++;
		}
	}
}