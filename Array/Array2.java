package Array;

import java.util.Scanner;

public class Array2 {
public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n,i;
	n=x.nextInt();
	Double sum=0.00, Ave;
	int [] b=new int[n];
	for(i=0;i<n;i++){
		b[i]=x.nextInt();
	}
	for(i=0;i<n;i++){
		sum=sum+b[i];
	}
	System.out.printf("Sum = %.0f\n",sum);
	Ave=sum/n;
	System.out.printf("Ave = %.0f\n",Ave);
}
}
