package Codes;

import java.util.Scanner;

public class PalindromNumber {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,sum=0,r,m;
		m=x.nextInt();
		n=m;
		while (n!=0){
			r=n%10;
			sum=sum*10+r;
			n=n/10;
		}
		System.out.printf("%d\n",sum);
		if(sum==m)
			System.out.printf("Palindrom\n");
		else {
			System.out.printf("Not Palndrom\n");
		}
	}

}
