package Codes;
import java.util.*;
public class Testnasapp {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		NasaAPP n=new NasaAPP(30,20 );
		
		double tb=input.nextDouble();
	    double sum=n.sum(30,20);
		n.cmp(tb, sum);

	}

}
