package Codes;

import java.util.Scanner;

public class SumofDigits {
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,sum=0,r;
		n=x.nextInt();
		while (n!=0){
			r=n%10;
			sum=sum+r;
			n=n/10;
		}
		System.out.printf("%d\n",sum);
	}

}
