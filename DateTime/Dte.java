package DateTime;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Dte {
public static void main(String[] args) {
	Date d = new Date();
	DateFormat df=new SimpleDateFormat("dd//MM//YYYY");
	String s = df.format(d);
	System.out.println("Current date: "+s);
	
}
}
