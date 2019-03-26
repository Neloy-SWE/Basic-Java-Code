package Codes;

public class WrapperClass {
public static void main(String[] args) {
	//auto boxing = primitive -> object rupantor
	int x=10; //primitive 
	Integer y = Integer.valueOf(x);
	/*object(Integer=class, 
	y= Integer class er under e object)**/
	System.out.println(y);
	
	Integer z=x+10;// automatically Integer.valueOf niye nibe
	System.out.println(z);
	//unboxing = object rupantor -> primitive
	Double d = Double.valueOf(10.12);
	System.out.println(d);
	double v = d.doubleValue()+100;
	System.out.println(v);
	double e=d+.99;
	//automatically d.doubleValue niye nibe
	System.out.println(e);
}
}
