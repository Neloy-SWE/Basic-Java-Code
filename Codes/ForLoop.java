package Codes;
import java.util.Scanner;
public class ForLoop{
	public static void main(String[]args) {
		Scanner x=new Scanner(System.in);
		int i, n;
		n=x.nextInt();
		for ( i = 1; i <= n; i++) {
			System.out.printf("%d Neloy is the Boss\n",i);
		}
	}
}