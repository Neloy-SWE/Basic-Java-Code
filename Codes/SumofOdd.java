package Codes;

import java.util.Scanner;

public class SumofOdd{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int i,sum=0, n,m;
		System.out.printf("Enter Small number: ");
		n=x.nextInt();
		System.out.printf("Enter Big Number: ");
		m=x.nextInt();
		for ( i = n; i <=m; i++) {
			if (i%2==1){
				sum=sum+i;
			}
			
		}
		System.out.printf("Sum = %d",sum);
	}
}