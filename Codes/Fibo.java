package Codes;

import java.util.Scanner;

public class Fibo {
public static void main(String[] args) {
	Scanner x= new Scanner(System.in);
	int n,f1=0,f2=1,f,i;
	n=x.nextInt();
	System.out.printf("%d\n%d\n",f1,f2);
	for (i = 3; i<=n; i++) {
		f=f1+f2;
		System.out.printf("%d\n",f);
		f1=f2;
		f2=f;
	}

}
}
