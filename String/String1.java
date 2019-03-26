package String;
public class String1{
	public static void main(String[] args) {
		String a="Neloy";
		String d= new String("Neloy");
		String e= new String("neloy");
		String b=new String("The Boss");
		char[] c={'N','e','e','l'};
		System.out.println(c);
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
		System.out.println(e);
		System.out.println("Length of a is: "+a.length());
		System.out.println("Length of b is: "+b.length());
		System.out.println();
		System.out.println();
		System.out.println("For == operator:");
		if(a==d){
			System.out.println("a and d are equal");
		}
		else{
			System.out.println("a and d are not equal");
		}
		
		System.out.println("For .equals method: ");
		
		if(a.equals(d)){
			System.out.println("a and d are equal");
		}
		else{
			System.out.println("a and d are not equal");
		}
		
		System.out.println("For .contains method:");
		
		if(a.contains(d)){
			System.out.println("a and d are equal");
		}
		else{
			
			System.out.println("a and d are not equal");
		}
		
		System.out.println("For .equalsIgnoreCase: ");
		
		if(a.equalsIgnoreCase(e)){
			System.out.println("a and e are equal");
		}
		else{
			System.out.println("a and e are not equal");
		}
		boolean x=a.contains("N");
		System.out.println(x);
		
		System.out.println("Use of isEmpty method:");
		
		boolean n=a.isEmpty();
		System.out.println(n);
		
	}
}