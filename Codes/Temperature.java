package Codes;
import java.util.Scanner;
public class Temperature{
	public static void main(String[]args){
		Scanner a= new Scanner(System.in);
		double c,f;
		c=a.nextDouble();
		f=1.8*c+32;
		System.out.print(+f);
	}
}