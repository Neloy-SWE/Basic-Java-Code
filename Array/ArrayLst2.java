package Array;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLst2{
	public static void main(String[]args){
		Scanner x=new Scanner(System.in);
		int n,i,d;
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> b=new ArrayList<>();
		ArrayList<Integer> c=new ArrayList<>();
		n=x.nextInt();
		for(i=0;i<n;i++){
			d=x.nextInt();
			a.add(d);
		}
		System.out.println("A="+a);
		
		for(i=0;i<n;i++){
			d=x.nextInt();
			b.add(d);
		}
		System.out.println("B="+b);
		
		c.addAll(a);
		System.out.println("C="+c);
		
		Boolean f = a.equals(b);
		System.out.println("Is a and b equal?? "+f);
		
		f = a.equals(c);
		System.out.println("Is a and c equal?? "+f);
	}
	
}