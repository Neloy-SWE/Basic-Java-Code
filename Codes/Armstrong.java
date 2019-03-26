package Codes;

import java.util.Scanner;

public class Armstrong {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,sum=0,r,m;
		m=x.nextInt();
		n=m;
		while (n!=0){
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		System.out.printf("%d\n",sum);
	if (sum==m){
		System.out.printf("Armstrong");
	}
	else{
		System.out.printf("Not Armstrong");
	}

}
}

