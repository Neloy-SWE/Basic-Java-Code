package Array;
import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class ArrayLst{
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n,i,b = 0;
		ArrayList<Integer> a=new ArrayList<Integer>();
		n=x.nextInt();
		for(i=0;i<n;i++){
			b=x.nextInt();
			a.add(b);
		}
		System.out.println("Print by Sysout:");
		System.out.println(a);
		System.out.println("\n\nPrint by For Each Loop:");
		for(int  c: a){
			System.out.printf("%d ",c);
		}
		System.out.println("\n\nPrint by iterator:");
		Iterator d=a.iterator();
		while(d.hasNext()){
			System.out.printf("%d",d.next());
		}
		System.out.printf("\n\nSize of Array is: %d",a.size());
	}
}