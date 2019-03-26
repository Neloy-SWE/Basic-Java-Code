package Codes;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[]args){
Scanner x = new Scanner(System.in);
	int a;
	a = x.nextInt();
	if(a%2==0){
		System.out.printf("Even\n");
	}
	else {
		System.out.printf("Odd\n");
	}
}
}
