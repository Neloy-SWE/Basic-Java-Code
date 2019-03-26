package Codes;
import java.util.Scanner;

public class Input2 {
	public static void main(String[]args){
		Scanner a = new Scanner(System.in);
		String s;
		System.out.print("Enter your name: ");
		s=a.nextLine();
		System.out.printf("Welcome Mr. %s",s);
	}		
}
