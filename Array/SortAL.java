package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortAL{
	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		int n,b,i;
		ArrayList<Integer> a=new ArrayList<>();
		ArrayList<Integer> d=new ArrayList<>();
		n=x.nextInt();
		for(i=0;i<n;i++){
			b=x.nextInt();
			a.add(b);
		}
		System.out.println("A="+a);
		
		Collections.sort(a);
		
		System.out.println("After sorting A="+a);
		Collections.sort(a,Collections.reverseOrder());
		System.out.println("Desending="+a);
	}
}