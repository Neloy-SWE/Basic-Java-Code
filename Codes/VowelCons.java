package Codes;
import java.util.Scanner;
public class VowelCons{
	public static void main(String[]args){
		Scanner x=new Scanner(System.in);
		char ch;
		ch=x.next().charAt(0);
		if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
			System.out.printf("The word is vowel\n");
		}
		else {
			System.out.printf("The word is consonent\n");
		}
	}
}