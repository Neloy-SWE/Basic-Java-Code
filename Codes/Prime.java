package Codes;

import java.util.Scanner;

public class Prime{
	public static void main(String[] args) {
		Scanner x=new Scanner(System.in);
		int n,i,count=0;
		n=x.nextInt();
		for(i=2; i<=n/2;i++){
			if(n%i==0){
				count++;
				break;
			}
		}
		if(count==0){
			System.out.printf("The number is a prime number\n");
		}
		else {
			System.out.printf("The number is not prime\n");
		}
	}
}