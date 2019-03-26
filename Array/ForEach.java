package Array;

import java.util.Scanner;

public class ForEach {
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	int[] a=new int[10];
	int i,n,sum=0;
	n=x.nextInt();
	for(i=0;i<n;i++){
		a[i]=x.nextInt();
	}
	for(int f:a){
		sum=sum+f;
	}
	System.out.printf("Sum is %d\n",sum);
}
}
