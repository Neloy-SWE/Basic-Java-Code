package Codes;
import java.util.Scanner;
public class Switch{
	public static void main(String[]args) {
		Scanner x=new Scanner(System.in);
		int a;
		a=x.nextInt();
		switch (a) {
		case 1:
			System.out.printf("One\n");
			break;
			case 2:
				System.out.printf("Two\n");
				break;

		default:
			System.out.printf("More than two\n");
			break;
		}
	}
}