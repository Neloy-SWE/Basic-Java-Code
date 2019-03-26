package Array;

import java.util.Scanner;

public class MamMinArray {
public static void main(String[] args) {
	Scanner x=new Scanner(System.in);
	int n,i;
	n=x.nextInt();
	int[] b=new int[n];
	for(i=0;i<n;i++){
		b[i]=x.nextInt();
	}
	int max=b[0];
	int min=b[0];
	for(i=1;i<n;i++){
		if(max<b[i]){
			max=b[i];
		}
	}
	System.out.printf("Max = %d\n",max);
		for(i=1;i<n;i++){
			if(min>b[i]){
				min=b[i];
			}
	}
		System.out.printf("Min = %d\n",min);
}
}
