package Codes;
import java.util.Scanner;
public class IfElseIf{
	public static void main(String[]args) {
		Scanner x= new Scanner(System.in);
		int z;
		z=x.nextInt();
		if(z>0){
		System.out.printf("Positive\n");
		}
		else if(z==0){
			System.out.printf("The number is zero\n");
		}
		else{
			System.out.printf("Negetive\n");
		}
	}
}