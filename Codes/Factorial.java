package Codes;

import java.util.Scanner;

public class Factorial{
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n, i, result=1;
		n=x.nextInt();
		if(n<=1){
			System.out.printf("Factorial of %d is 1\n",n);
		}
		else if(n>1){
		for(i=n;i>=1;i--){
			result=result*i;
	}
		System.out.printf("Factorial of %d is %d\n", n, result);
	}
}
}