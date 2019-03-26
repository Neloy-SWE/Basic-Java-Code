package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort{
	public static void main(String[]args){
		Scanner x=new Scanner(System.in);
		int n,i;
		n=x.nextInt();
	int [] a= new int [n];
	for(i=0;i<n;i++){
		a[i]=x.nextInt();
	}
	Arrays.sort(a);
	for(i=0;i<n;i++){
		System.out.printf("%d ",a[i]);
	}
	System.out.println();
	String[] b=new String[n];
	for(i=0;i<n;i++){
		b[i]=x.next();
	}
	Arrays.sort(b);
	for(i=0;i<n;i++){
		System.out.printf("%s ",b[i]);
	}
}
}