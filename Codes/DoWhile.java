package Codes;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int i=1,n;
		n=x.nextInt();
		do{
			System.out.printf("%d Neloy is back again\n",i);
			i++;
		}while(i<=n);
	}

}
