package String;

public class String4 {
public static void main(String[] args) {
	String n= "Neloy is the Boss";
	System.out.println(n);
	System.out.println("replace method for replace string:");
	String m= n.replace("Boss", "Don");
	System.out.println(m);
	System.out.println("split method for remove string");
	String[] o=n.split(" ");
	//split method return character array
	//that why use [] and for each loop
	for(String x: o){
	System.out.print(x);
	}
}
}
